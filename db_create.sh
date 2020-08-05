#!/usr/bin/env bash

psql postgres -c "CREATE USER clojure_pg_user WITH LOGIN SUPERUSER INHERIT CREATEDB CREATEROLE NOREPLICATION PASSWORD 'insecure_password'"

psql postgres -c "CREATE DATABASE clojure_pg_example WITH OWNER = clojure_pg_user ENCODING = 'UTF8' CONNECTION LIMIT = -1;"

# Create a db in ko_KR.UTF-8
# only possible to create it in psql interpreter
#
# CREATE DATABASE anylotto WITH OWNER=anylotto ENCODING='UTF-8' LC_COLLATE='ko_KR.UTF-8' LC_CTYPE='ko_KR.UTF-8' TEMPLATE template0

psql clojure_pg_example -f db/friends-table.sql
