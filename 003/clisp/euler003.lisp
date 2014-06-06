; Project Euler Problem 3
; Solution found here : https://groups.google.com/forum/#!msg/comp.lang.lisp/R1cfrqKzecI/LlS8DAxdJJEJ
; Study and undertsand!

(defun prime-factors (n)
  (labels ((next (x) (case x (2 3)
                             (t (+ 2 x))))
           (primes (n candidate)
             (cond
               ((> candidate n) nil)
               ((zerop (mod n candidate))
                 (cons candidate (primes (/ n candidate) candidate)))
               (t (primes n (next candidate))))))
    (primes n 2)))

(format t "~A" (car (last (prime-factors 600851475143))))
