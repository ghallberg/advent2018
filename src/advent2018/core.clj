(ns advent2018.core
  (:require [clojure.string :as str]
            [clojure.java.io :as io]
            [advent2018.day1 :as day1])
  (:gen-class))

(def day1-input
  (slurp (io/resource (str "input/1.txt"))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Day1: " (day1/solve day1-input)))

(defn line-join
  "Join a bunch of strings with line-breaks"
  [& strings]
  (str/join "\n" strings))


