SUMMARY = "DBI PostgreSQL interface"
DESCRIPTION = "DBD::Pg is a Perl module that works with the DBI module to provide access \
to PostgreSQL databases."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "3.16.3"

RPM_NAME = "perl-DBD-Pg-3.16.3-1.1.aarch64.rpm"
RPM_HASH = "1c89bc3c861caffc5f9a6f9a97543d232ebe8a10d679ce4efab74c627789efbdd490f90f78b6c74613a866c6af09707b1c7101a9e46f78d39f1c02b8487ff412"

RPROVIDES:${PN} += "perl(Bundle::DBD::Pg) perl(DBD::Pg) perl(DBD::Pg::DefaultValue) perl(DBD::Pg::db) perl(DBD::Pg::dr) perl(DBD::Pg::st) perl-DBD-Pg perl-DBD-Pg(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpq.so.5()(64bit) perl(:MODULE_COMPAT_5.36.0) perl(DBI) perl(version)"

inherit rpm
