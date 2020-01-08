(defn get-divisors [n]
  (range 2 (+ 1 (int (Math/sqrt n)))))

(defn divides? [x n]
  (integer? (/ x n)))

(defn no-divisors? [n]
    (->> (get-divisors n)
      (filter (partial divides? n)) empty?)
    )

(defn is-prime? [n]
    (if (== n 1)
      (false? (= 1 1)
    )
    (if (> n 1)
      (no-divisors? n)
    )
  )
)

(defn prime-seq [from to]
  (filter is-prime? (range from (+ 1 to)))
  )

(defn print-top-primes [from to]
  (doseq [i (take 10 (reverse (prime-seq from to)))]
    (println i)
  )
  (println "Total =" (reduce + (prime-seq from to)))
)

(print-top-primes 0 35)s
