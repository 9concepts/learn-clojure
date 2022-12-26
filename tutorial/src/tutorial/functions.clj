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

(def increment (fn [x] (+ x 1)))

(defn increment_set [array] (map increment array))

(println (increment_set [1, 2, 3]))

(defn DataTypes []
  (def a 1)
  (def b 1.25)
  (def c 1.25e-12)
  (println a)
  (println b)
  (println c))

(DataTypes)

(defn greet [name] (str "Hello, " name))

; multi-arity function
(defn messenger
  ([] (messenger "Hello world!"))
  ([msg] (println msg)))

; variadic-function
(defn hello [greeting & who]
  (println greeting who))
