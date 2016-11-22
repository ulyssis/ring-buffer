<<<<<<< HEAD
#hello! Haha
(defproject amalloy/ring-buffer "1.2"
=======
(defproject amalloy/ring-buffer "1.2.1"
>>>>>>> a57aa49ae8cb6837d4a5129d3133f88e5974c2db
  :description "Persistent bounded-size queue implementation in Clojure"
  :url "http://github.com/amalloy/ring-buffer"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.48"]]
  :plugins [[lein-cljsbuild "1.0.6"]
            [lein-doo "0.1.4"]]

  :cljsbuild {
    :builds {
      :test {:source-paths ["src" "test"]
             :compiler {:output-to "target/testable.js"
                        :main 'amalloy.runner
                        :optimizations :none}}}})
