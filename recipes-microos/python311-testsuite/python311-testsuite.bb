SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.11.2"

RPM_NAME = "python311-testsuite-3.11.2-1.6.aarch64.rpm"
RPM_HASH = "6802cbd5f52bfc49da22c170bb2673b18b870557695b68815ee54bdce65bd572013efad955f6e574c09e2a780aaf70296d5d18150160dec83fe0c21c886c1436"

RPROVIDES:${PN} += "python311-testsuite python311-testsuite(aarch-64)"
RDEPENDS:${PN} += "/bin/bash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) python(abi) python311 python311-tk"

inherit rpm
