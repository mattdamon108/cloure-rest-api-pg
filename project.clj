(defproject clojure-rest-api-pg "0.1.0-SNAPSHOT"
  :description "A simple clojure REST API with psql DB"
  :url "https://github.com/mattdamon108"
  :license {:name "MIT"
            :url "https://github.com/mattdamon108"} ; TODO: update license
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/data.json "0.2.6"]
                 [org.clojure/java.jdbc "0.7.10"]
                 [org.postgresql/postgresql "42.1.4"]
                 [ring/ring-defaults "0.3.2"]
                 [ring/ring-devel "1.6.3"]
                 [ring/ring-json "0.5.0"]
                 [compojure "1.6.1"]
                 [http-kit "2.3.0"]
                 [lynxeyes/dotenv "1.1.0"]]
  :main ^:skip-aot clojure-rest-api-pg.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all} :dev {:main clojure-rest-api-pg.core/-dev-main}}
  :repl-options {:init-ns clojure-rest-api-pg.core})
