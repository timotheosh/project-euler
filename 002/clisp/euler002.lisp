
(defun euler-002 (n)
  "Returns the sum of all even numbers in the Fibonnaci sequence less than n"
  (setf curr 1)
  (setf prev 1)
  (setf sum 0)
  (loop while (< curr n) do
       (setf c curr)
       (if (zerop (mod curr 2))
           (setf sum (+ sum c)))
       (setf curr (+ prev c))
       (setf prev c))
  sum
)

(print (euler-002 4000001))
