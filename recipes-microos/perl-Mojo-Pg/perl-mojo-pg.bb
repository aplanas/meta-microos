SUMMARY = "Wrapper around DBD::Pg for using PostgreSql with Mojolicious"
DESCRIPTION = "Mojo::Pg is a tiny wrapper around DBD::Pg that makes at \
http://www.postgresql.org a lot of fun to use with the at \
https://mojolicious.org real-time web framework. Perform queries blocking \
and non-blocking, use all at \
https://www.postgresql.org/docs/current/static/sql.html PostgreSQL has to \
offer, generate CRUD queries from data structures, manage your database \
schema with migrations and build scalable real-time web applications with \
the publish/subscribe pattern."
LICENSE = "Artistic-2.0"

PV = "4.27"

RPM_NAME = "perl-Mojo-Pg-4.27-1.7.noarch.rpm"
RPM_HASH = "b634d0f4ec3b145eb0e1bc3f3e9884904680ca1c6b7fe915f093802ad4da8e1b262a8ac728a3336151e6fc249af6968875333dac91adef7bd3922be1a08ce84f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Mojo::Pg) \
perl(Mojo::Pg::Database) \
perl(Mojo::Pg::Migrations) \
perl(Mojo::Pg::PubSub) \
perl(Mojo::Pg::Results) \
perl(Mojo::Pg::Transaction) \
perl-Mojo-Pg"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(DBD::Pg) \
perl(Mojolicious) \
perl(SQL::Abstract::Pg)"

inherit rpm
