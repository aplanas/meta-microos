SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.8.16"

RPM_NAME = "python38-testsuite-3.8.16-7.1.aarch64.rpm"
RPM_HASH = "f3a4d1a23daf3910ec157843fe8ec24a1d7ae2e574ed4261bcf053dab8c05041d4bc5c1765053dc5023c02d432bfaa4db3b4e39b5e817e78168e84617ed248f4"

RPROVIDES:${PN} += "python38-testsuite python38-testsuite(aarch-64)"
RDEPENDS:${PN} += "/bin/bash ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) python(abi) python38 python38-tk"

inherit rpm
