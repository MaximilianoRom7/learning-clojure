(ns clients.db
  (:use [korma.core]
        [korma.db]))

(defdb pg (postgres
           {:host "localhost"
            :port "5432"
            :db "clojureClients"
            :user "postgres"
            :delimiters ""}))

(defentity clients
  (entity-fields :id :name :phone :country))

(select clients)

(insert clients
        (values {:name "Maximiliano Romay"
                 :phone "+541134179707"
                 :country "Argentina"}))

(select clients)
