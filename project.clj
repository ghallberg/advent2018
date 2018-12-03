(defproject advent2018 "0.1.0-SNAPSHOT"
  :description "Solutions for advent of code 2018 by Gustaf Hallberg"
  :url "https://github.com/ghallberg/advent2018"
  :license {:name "MIT License"
            :url "https://github.com/ghallberg/advent2018/blob/master/LICENSE"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot advent2018.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
