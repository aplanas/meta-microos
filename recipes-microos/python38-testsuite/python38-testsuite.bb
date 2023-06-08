SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.8.16"

RPM_NAME = "python38-testsuite-3.8.16-6.1.aarch64.rpm"
RPM_HASH = "7a8e34eefdda71b589c00fc005c9ad02948412f63302d49980a26812c6f9b04775570f51ff9a3ba93abbe343957cca432e2157b34c59c326439680cfb46b1ad4"

RPROVIDES:${PN} += "python38-testsuite python38-testsuite(aarch-64)"
RDEPENDS:${PN} += "/bin/bash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) python(abi) python38 python38-tk"

inherit rpm
