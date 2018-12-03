(ns advent2018.day1
  (:require [clojure.string :as str]))

(def string->op {"+" +
                 "-" -})

(defn line-parser [line]
  (let [operator (string->op (str (first line)))
        amount (read-string (str (ji line)))]
      [operator amount]))


(defn parse [input]
  (let [lines (str/split-lines input)]
    (map line-parser lines)))

(defn sum-pairs [sum [head & rest]]
  (let [[operator amount] head
        new-sum (operator sum amount)]
    (println new-sum)
    (if (empty? rest)
      new-sum
      (recur new-sum rest))))

(defn solve [input]
  (let [parsed-input (parse input)]
    (sum-pairs 0 parsed-input)))
