; Project Euler Problem 3

(defun primeFactors (n)
  (setf pf nil)
  ; Step 1. Add the number of 2s that divide n
  (while (zerop (mod n 2))
    (cons n pf)
    (setf n (/ n 2)))

  ; Step 2. n must be odd at this point.  So we can skip one element
  ;   (Note i = i +2)
  (loop for i from 3
  
