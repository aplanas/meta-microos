SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "15.3"

RPM_NAME = "postgresql15-test-15.3-1.2.aarch64.rpm"
RPM_HASH = "7c518a5be9f0660a06df2a242606c0077a75d71182c5f43ed7970f5b2bfed2882c715eab35ba3cb63bf3746927ac77c832885e0da3adee7ed182733029586f12"

RPROVIDES:${PN} += "postgresql-test-implementation \
postgresql15-test \
postgresql15-test(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
postgresql-test-noarch \
postgresql15-server"

inherit rpm
