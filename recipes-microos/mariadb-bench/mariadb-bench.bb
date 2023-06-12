SUMMARY = "Benchmarks for MariaDB"
DESCRIPTION = "This package contains benchmark scripts and data for MariaDB. \
 \
To run these database benchmarks, start the script 'run-all-tests' in \
the directory /usr/share/sql-bench after starting MariaDB."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "10.11.3"

RPM_NAME = "mariadb-bench-10.11.3-1.1.aarch64.rpm"
RPM_HASH = "c6fa35406b06d974e1e9914789040eb968a7c517b7ebe9fae3a88a850768e68863bcdb770649dc36c7aafb529ab888af869af38842c58ddca36fd91d9b8c7993"

RPROVIDES:${PN} += "mariadb-bench \
mariadb-bench(aarch-64) \
mysql-bench"
RDEPENDS:${PN} += "/bin/bash \
/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libz.so.1()(64bit) \
mariadb-client \
perl-DBD-mysql"

inherit rpm
