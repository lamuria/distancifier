(ns distancifier.core)

(def earth-radius-in-kms 6371.009)
(def earth-radius-in-miles 3958.761)

(defn to-radians
  [point]
  (mapv #(Math/toRadians %) point))

(defn sin-calc
  [lat1 lat2]
  (* (Math/sin lat1) (Math/sin lat2)))

(defn cos-calc
  [lat1 lat2 long1 long2]
  (* (Math/cos lat1) (Math/cos lat2) (Math/cos (- long1 long2))))

(defn distance
  ([point1 point2]
   (let [in-miles (distance point1 point2 earth-radius-in-miles)
         in-kms (distance point1 point2 earth-radius-in-kms)]
    {:miles in-miles :kms in-kms}))
  ([point1 point2 earth-radius]
  (let [[lat1 long1] (to-radians point1)
        [lat2 long2] (to-radians point2)]
    (* earth-radius
       (Math/acos (+ (sin-calc lat1 lat2)
                     (cos-calc lat1 lat2 long1 long2)))))))
