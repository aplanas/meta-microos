SUMMARY = "MariaDB and MySQL driver for the Perl5 Database Interface (DBI)"
DESCRIPTION = "*DBD::MariaDB* is the Perl5 Database Interface driver for MariaDB and MySQL \
databases. In other words: DBD::MariaDB is an interface between the Perl \
programming language and the MariaDB/MySQL programming API that comes with \
the MariaDB/MySQL relational database management system. Most functions \
provided by this programming API are supported. Some rarely used functions \
are missing, mainly because no-one ever requested them."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.22"

RPM_NAME = "perl-DBD-MariaDB-1.22-1.10.aarch64.rpm"
RPM_HASH = "cab08fdc1a4dced2f19012a8be37877f85377c970e240224ed8f4528b1ac43cd27e78e9df861491c47c2309a85127ba69abb3173c01d18bdc71b36615a5b3a6b"

RPROVIDES:${PN} += "perl(DBD::MariaDB) perl-DBD-MariaDB perl-DBD-MariaDB(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libmariadb.so.3()(64bit) libmariadb.so.3(libmariadb_3)(64bit) libmariadb.so.3(libmysqlclient_18)(64bit) perl(:MODULE_COMPAT_5.36.0) perl(DBI) perl(DynaLoader) perl(strict) perl(warnings)"

inherit rpm
