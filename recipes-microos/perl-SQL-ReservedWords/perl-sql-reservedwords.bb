SUMMARY = "Reserved SQL words by ANSI/ISO"
DESCRIPTION = "Determine if words are reserved by ANSI/ISO SQL standard."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.8"

RPM_NAME = "perl-SQL-ReservedWords-0.8-5.24.noarch.rpm"
RPM_HASH = "034b408483c9bbf49047337a3c54ea2821e28bcb3d2bb12b72372da4df9de498403d019ea0cfb9c14bec8498972a02d6b6fd5279c2d3ba606485db91a2713495"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(SQL::ReservedWords) perl(SQL::ReservedWords::DB2) perl(SQL::ReservedWords::MySQL) perl(SQL::ReservedWords::ODBC) perl(SQL::ReservedWords::Oracle) perl(SQL::ReservedWords::PostgreSQL) perl(SQL::ReservedWords::SQLServer) perl(SQL::ReservedWords::SQLite) perl(SQL::ReservedWords::Sybase) perl-SQL-ReservedWords"
RDEPENDS:${PN} += "/usr/bin/perl perl(:MODULE_COMPAT_5.36.0) perl(Sub::Exporter)"

inherit rpm
