SUMMARY = "SQL support using DBI for syslog-ng"
DESCRIPTION = "This package provides the libafsql module providing support for \
logging into a SQL database using DBI."
LICENSE = "GPL-2.0-only"

PV = "4.0.1"

RPM_NAME = "syslog-ng-sql-4.0.1-1.4.aarch64.rpm"
RPM_HASH = "dae2e20e85bd44bf085e88734a9766c83fc5b3ed09b011137d70ca5994188862d23f155d030f64f675f0ef0b62f02ff252af5e747870881cebbffe9f18053c6f"

RPROVIDES:${PN} += "libafsql.so()(64bit) syslog-ng-sql syslog-ng-sql(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libdbi.so.3()(64bit) libdbi.so.3(ABI_3)(64bit) libsyslog-ng-4.0.so.0()(64bit) syslog-ng"

inherit rpm
