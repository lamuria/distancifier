# distancifier [![Build Status](https://travis-ci.org/lamuria/distancifier.svg?branch=master)](https://travis-ci.org/lamuria/distancifier)

![Clojars Project](http://clojars.org/distancifier/latest-version.svg)

A Clojure library designed to calculate a distance between two coordinates on Earth.
The algorithm used is based on [Great Circle distance](https://en.wikipedia.org/wiki/Great-circle%5Fdistance).

## Usage

``` clojure
(:require [distancifier.core :as core])

(core/distance [38.736946 -9.142685] [40.730610 -73.935242]) ; => {:miles 3364.6154140785607, :kms 5414.824255526726}
```

## License

Copyright © 2015

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
