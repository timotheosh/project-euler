(defun range (max &key (min 0) (step 1))
     (loop for n from min below max by step
		         collect n))

(loop for i in (union (range 1000 :step 3) (range 1000 :step 5)) sum i)
