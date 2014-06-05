(ns clojure-euler.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (reduce +
                   (distinct
                    (concat (range 3 1000 3)
                            (range 5 1000 5))))))
