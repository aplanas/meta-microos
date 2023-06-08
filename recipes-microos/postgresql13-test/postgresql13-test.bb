SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "13.10"

RPM_NAME = "postgresql13-test-13.10-2.1.aarch64.rpm"
RPM_HASH = "125d9938dca3a226c2dfc6028eba711acede7fd258e835c41df109081f68c36b95b285a6af41029963e51f876bebba114a02241217259fd8073de2b5b8e2a622"

RPROVIDES:${PN} += "postgresql-test-implementation postgresql13-test postgresql13-test(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) postgresql-test-noarch postgresql13-server"

inherit rpm
