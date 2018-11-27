(def jetty-version "9.4.11.v20180605")

(defproject jetty-experiment "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
    [ring/ring-core "1.6.3"]
    [ring/ring-jetty-adapter "1.6.3"]
    [org.eclipse.jetty/jetty-server ~jetty-version]]
  :main jetty_experiment.core)
