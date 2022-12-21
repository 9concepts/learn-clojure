(ns tutorial.functions
  (:gen-class))

(defn -main
  "First function"
  []
  (println "My name is John")
  (println "loving Clojure so far")
  (+ 2 5))

(#(println "Hello"))

(fn [message] (println message))

(def greet (fn [message] (println message)))
