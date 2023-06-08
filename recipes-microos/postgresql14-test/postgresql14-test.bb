SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "14.7"

RPM_NAME = "postgresql14-test-14.7-2.1.aarch64.rpm"
RPM_HASH = "58317cfb50a159d19d78c42688bb38590c0d5d9e8df2423c1389e0892eb68de175a2cef5491b39b2650241c13c8b321a5e5a97f643f7f976a6a20d96796aaf5f"

RPROVIDES:${PN} += "postgresql-test-implementation postgresql14-test postgresql14-test(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) postgresql-test-noarch postgresql14-server"

inherit rpm
