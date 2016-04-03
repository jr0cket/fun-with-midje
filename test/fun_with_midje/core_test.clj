(ns fun-with-midje.core-test
  (:use midje.sweet)
  (:use [fun-with-midje.core]))

(println "You should expect to see three failures below.")

(facts "about `first-element`"
  (fact "it normally returns the first element"
    (first-element [1 2 3] :default) => 1
    (first-element '(1 2 3) :default) => 1)

  ;; I'm a little unsure how Clojure types map onto the Lisp I'm used to.
  (fact "default value is returned for empty sequences"
    (first-element [] :default) => :default
    (first-element '() :default) => :default
    (first-element nil :default) => :default
    (first-element (filter even? [1 3 5]) :default) => :default))


(fact "strings are equal"
  "string is equal" => "string is equal")

(fact "strings not equal"
   "spice" => "space")

(deftest map-comparisons
  (is (= {:sheep 1} {:cheese 1 :sheep 1}))
  (is (= {:sheep 1 :cheese 1} {:sheep 1}))
  (is (= {:sheep 1 :cheese 1} {:sheep 1 :cheese 5})))

(fact "map-comparisons"
      )
