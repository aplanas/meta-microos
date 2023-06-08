SUMMARY = "Benchmarks for MariaDB"
DESCRIPTION = "This package contains benchmark scripts and data for MariaDB. \
 \
To run these database benchmarks, start the script 'run-all-tests' in \
the directory /usr/share/sql-bench after starting MariaDB."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "10.11.2"

RPM_NAME = "mariadb-bench-10.11.2-2.3.aarch64.rpm"
RPM_HASH = "969ab31a6db1a6d1aa85d81e1eb128d1c5c88225a4a16703b55009a8cd48411b5ee29481136aa8ab760ebf23e104b54e964d84d2133fa1d444487163d947fba2"

RPROVIDES:${PN} += "mariadb-bench mariadb-bench(aarch-64) mysql-bench"
RDEPENDS:${PN} += "/bin/bash /usr/bin/perl ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libz.so.1()(64bit) mariadb-client perl-DBD-mysql"

inherit rpm
