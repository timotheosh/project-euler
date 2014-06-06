(ns clojure-euler003.core
  (:gen-class))

(defn prime-factors [n] 
    {:pre [(pos? n) (integer? n)]}
    (loop [n n, s 2, a '()]
        (if-let [f (->> ; find smallest factor
                (range s n) 
                (take-while #(<= % (Math/sqrt n)))
                (filter #(zero? (rem n %)))
                first)]              
            (recur (/ n f) f (conj a f)) ; factor found
            (conj a n))))    ; n is prime

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (first (prime-factors 600851475143))))
