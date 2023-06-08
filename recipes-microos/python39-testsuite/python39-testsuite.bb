SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.9.16"

RPM_NAME = "python39-testsuite-3.9.16-6.1.aarch64.rpm"
RPM_HASH = "522a8910b3adae59a7b5ea57f280d40facd509bf19eb0d24f386d3abc1a33ffb3158c4bcb475bc9a300debad5dcd4783a7ae33f4e04ef66a99b796a39df7a375"

RPROVIDES:${PN} += "python39-testsuite python39-testsuite(aarch-64)"
RDEPENDS:${PN} += "/bin/bash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) python(abi) python39 python39-tk"

inherit rpm
