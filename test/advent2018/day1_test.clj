(ns advent2018.day1-test
  (:require [clojure.test :refer :all]
            [advent2018.day1 :refer :all]
            [advent2018.core :as core]))


(def input1
  (core/line-join "+1"
                  "+1"
                  "+1"))
(def input2
  (core/line-join "+1"
                  "+1"
                  "-2"))
(def input3
  (core/line-join "-1"
                  "-2"
                  "-3"))
(def input4
  (core/line-join "+1"
                  "-2"
                  "+3"
                  "+1"))
(def input->solution
  {input1 3
   input2 0
   input3 -6
   input4 3})

(deftest line-parser-test
  (is (= [+ 3] (line-parser "+3"))
      (= [- 1] (line-parser "-1"))))


(deftest parse-test
  (is (= [[+ 1] [+ 1] [+ 1]] (parse input1))))


(deftest solve-test
  (is (= (solve input1) (input->solution input1)))
  (is (= (solve input2) (input->solution input2)))
  (is (= (solve input3) (input->solution input3)))
  (is (= (solve input4) (input->solution input4))))
