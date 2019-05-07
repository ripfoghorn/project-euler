(ns projeuler.core
  (:require [projeuler.1.solution :as p1]
            [projeuler.2.solution :as p2]
            [projeuler.3.solution :as p3]
            [projeuler.4.solution :as p4]
            [projeuler.5.solution :as p5]
            [projeuler.6.solution :as p6]
            [projeuler.7.solution :as p7]
            [projeuler.8.solution :as p8])
  (:gen-class))

(def problems
  [{:prob (p1/run) :id 1}
   {:prob (p2/run) :id 2}
   {:prob (p3/run) :id 3}
   {:prob (p4/run) :id 4}
   {:prob (p5/run) :id 5}
   {:prob (p6/run) :id 6}
   {:prob (p7/run) :id 7}
   {:prob (p8/run) :id 8}])

(defn -main []
  (println "Project Euler Solutions")
  (dorun (map #(println (:id %) "-" (:prob %)) problems)))
