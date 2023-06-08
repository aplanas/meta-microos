SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "15.2"

RPM_NAME = "postgresql15-test-15.2-3.1.aarch64.rpm"
RPM_HASH = "88b6113e17c5f614ba6bf10091dbee96ad186f4bae2ac6f394867d524fe401c677ff339acba5137d47f0da7a95873fc0028c20543e096c556fcfeaab2e714b98"

RPROVIDES:${PN} += "postgresql-test-implementation postgresql15-test postgresql15-test(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) postgresql-test-noarch postgresql15-server"

inherit rpm
