(defn predict-balance [initial interestRate years]
    (* initial (Math/pow (+ 1 interestRate) years))
  )

(defn year-to-target [initial target interestRate]
    (Math/ceil (/ (- (Math/log target) (Math/log initial)) (Math/log (+ 1 interestRate))))
  )

(defn target-years [initial target interestRate]
    (range 0 (+ 1 (year-to-target initial target interestRate)))
  )

(defn print-target [initial target interestRate]
      (doseq [i (target-years initial target interestRate)]
      (println "Year" i ":" (predict-balance initial interestRate i))
    )
  )

(print-target 100 105 0.005)
