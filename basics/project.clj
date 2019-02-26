(defproject basics "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-ring "0.12.5"]]
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring "1.7.1"]
                 [compojure "1.6.1"]
                 [hiccup "2.0.0-alpha2"]]
  :ring {:handler basics.core/routes
         :auto-reload? true
         :auto-refresh? true}
  :main ^:skip-aot basics.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
