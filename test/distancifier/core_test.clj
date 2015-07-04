(ns distancifier.core-test
  (:require [clojure.test :refer :all]
            [distancifier.core :as core]))

(deftest earth-radius-test
  (testing "earth radius in kms"
    (is (= 6371.009
           core/earth-radius-in-kms)))
  (testing "earth radius in miles"
    (is (= 3958.761
           core/earth-radius-in-miles))))

(deftest distance-test
  (testing "lisbon and new york"
    (let [lisbon-point [38.736946 -9.142685]
          new-york-point [40.730610 -73.935242]
          expected-result {:kms 5414.824255526726 :miles 3364.6154140785607}
          actual-result (core/distance lisbon-point new-york-point)]
      (is (= expected-result
             actual-result)))))
