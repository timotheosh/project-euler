(ns clojure-euler.core
  (:gen-class))

(defn euler-002 [n]
  (def curr 1)
  (def prev 1)
  (def sum 0)
  (while (< curr n)
    (def c curr)
    (if (zero? (mod curr 2))
      (def sum (+ sum c)))
    (def curr (+ prev c))
    (def prev c))
  sum)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (euler-002 4000001)))
  
