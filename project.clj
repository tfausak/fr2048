(defproject fr2048 "1.0.0"
  :description "A 2048 clone in Frege."
  :url "https://github.com/tfausak/fr2048"
  :license {:name "The MIT License"
            :url "http://opensource.org/licenses/MIT"}
  :plugins [[lein-fregec "3.22.524"]]
  :prep-tasks ["fregec"]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.frege-lang/frege "3.22.524-gcc99d7e"]]
  :main fr2048.Main
  :profiles {:uberjar {:aot :all}})
