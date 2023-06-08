SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "12.14"

RPM_NAME = "postgresql12-test-12.14-2.1.aarch64.rpm"
RPM_HASH = "cc5da745c6ca193452035fa9011f74a1b55d8b9d053eb112d61f63469aa30fbba750043ec97390293420005cd0d2445a5d38db70f40e2642558a1ccfc64799a8"

RPROVIDES:${PN} += "postgresql-test-implementation postgresql12-test postgresql12-test(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) postgresql-test-noarch postgresql12-server"

inherit rpm
