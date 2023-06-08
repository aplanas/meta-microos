SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.12.0a7"

RPM_NAME = "python312-testsuite-3.12.0a7-1.2.aarch64.rpm"
RPM_HASH = "835b7a29ca219606469b090e40f2ba3e70f9cfc674e205cb748a11217ddc5d2362b841e3bdf0b67d44c04cb0e00ab06caaf4492016da924a884c818cd9c860a2"

RPROVIDES:${PN} += "python312-testsuite python312-testsuite(aarch-64)"
RDEPENDS:${PN} += "/bin/bash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) python(abi) python312 python312-tk"

inherit rpm
