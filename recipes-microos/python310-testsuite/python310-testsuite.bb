SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.10.10"

RPM_NAME = "python310-testsuite-3.10.10-2.3.aarch64.rpm"
RPM_HASH = "c76b64cb88fca22e05750aac4f39829c95389c37c4d3504eb2b6f602154af288787ed171a6664ffb00ff651bd7536efbb5117b3b886d133f1965ab71a4da4bc5"

RPROVIDES:${PN} += "python3-testsuite python310-testsuite python310-testsuite(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) python(abi) python310 python310-tk"

inherit rpm
