SUMMARY = "Database URIs"
DESCRIPTION = "Database URIs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.20"

RPM_NAME = "perl-URI-db-0.20-1.4.noarch.rpm"
RPM_HASH = "16f702e1a96285038cf55ed383bce3f99f9b34ced0d47d42b37f77732083427b4850167bf085d3a1627b3c8c3f3c30f91ebfa7c36ccd59d86def9f09840b6f9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(URI::_ado) perl(URI::_db) perl(URI::_odbc) perl(URI::cassandra) perl(URI::cockroach) perl(URI::cockroachdb) perl(URI::couch) perl(URI::couchdb) perl(URI::cubrid) perl(URI::db) perl(URI::db2) perl(URI::derby) perl(URI::exasol) perl(URI::firebird) perl(URI::hive) perl(URI::impala) perl(URI::informix) perl(URI::ingres) perl(URI::interbase) perl(URI::ldapdb) perl(URI::maria) perl(URI::mariadb) perl(URI::max) perl(URI::maxdb) perl(URI::monet) perl(URI::monetdb) perl(URI::mongo) perl(URI::mongodb) perl(URI::mssql) perl(URI::mysql) perl(URI::oracle) perl(URI::pg) perl(URI::pgsql) perl(URI::pgxc) perl(URI::postgres) perl(URI::postgresql) perl(URI::postgresxc) perl(URI::redshift) perl(URI::snowflake) perl(URI::sqlite) perl(URI::sqlite3) perl(URI::sqlserver) perl(URI::sybase) perl(URI::teradata) perl(URI::unify) perl(URI::vertica) perl(URI::yugabyte) perl(URI::yugabytedb) perl-URI-db"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(URI) perl(URI::Nested)"

inherit rpm
