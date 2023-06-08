SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "11.19"

RPM_NAME = "postgresql11-test-11.19-2.1.aarch64.rpm"
RPM_HASH = "d7a5da6eca7f3e1737abeb54c2ce6e188ce7917e3d8493669bc80484cafacc9e5fc9f942af7140bd418f76be58914424499b72bdbe2b574d37097123c3408650"

RPROVIDES:${PN} += "postgresql-test-implementation postgresql11-test postgresql11-test(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) postgresql-test-noarch postgresql11-server"

inherit rpm
