SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.10.11"

RPM_NAME = "python310-testsuite-3.10.11-1.2.aarch64.rpm"
RPM_HASH = "86205079d3935609cdf631d0da4f37eadbcfae39a7fe9b612916e8c8d2a509b3d10e69b10df60478b07eb3991a232bb11488547efe9cd9547a29928c0ce410ed"

RPROVIDES:${PN} += "python3-testsuite python310-testsuite python310-testsuite(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) python(abi) python310 python310-tk"

inherit rpm
