(defproject clients "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [korma "0.5.0-RC1"]
                 [org.postgresql/postgresql "42.2.5.jre7"]]
  :ring {:handler basics.core/app-routes
         :auto-reload? true
         :auto-refresh? true}
  :main ^:skip-aot clients.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
