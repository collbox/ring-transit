(defproject ring-transit "0.1.0-SNAPSHOT"
  :description "Ring middleware for handling transit format"
  :url "https://github.com/jalehman/ring-transit"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [com.cognitect/transit-clj "0.8.229"]
                 [prismatic/plumbing "0.3.3"]
                 [ring/ring-core "1.3.0"]])
