(ns fixture-only.core-test
  (:require [clojure.test :refer :all]))

(defn fixture [f]
  (throw (Exception.)))

(use-fixtures :once fixture)

(deftest a-test)
