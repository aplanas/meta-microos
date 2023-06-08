SUMMARY = "Tcl binding for SQLite"
DESCRIPTION = "This package contains laguage bindings from the Tcl programming \
language SQLite. \
 \
SQLite is a C library that implements an embeddable SQL database \
engine. Programs that link with the SQLite library can have SQL \
database access without running a separate RDBMS process."
LICENSE = "SUSE-Public-Domain"

PV = "3.41.2"

RPM_NAME = "sqlite3-tcl-3.41.2-1.1.aarch64.rpm"
RPM_HASH = "847b6398f0fae0abd11fb962a0772f39ba43e483f4c0b9a58117635f5d5cc771df998858a517aeeef7dd030b32ba38046872498762fa7ea0e2acaa64d21af80f"

RPROVIDES:${PN} += "libtclsqlite3.so()(64bit) sqlite3-tcl sqlite3-tcl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libsqlite3.so.0()(64bit)"

inherit rpm
