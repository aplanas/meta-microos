SUMMARY = "Unit tests for Python and its standard library"
DESCRIPTION = "Unit tests that are useful for verifying integrity and functionality \
of the installed Python interpreter and standard library. \
They are a documented part of stdlib, as a module 'test'."
LICENSE = "Python-2.0"

PV = "3.12.0b1"

RPM_NAME = "python312-testsuite-3.12.0b1-1.2.aarch64.rpm"
RPM_HASH = "52b6dfe9e19cd356b44f5607d88eef221a4be28ea9f1d8f000d8551fae2a3cdfb63e71763e5900d029febe9ca4d93f3b6f29538b66a104e50a95edabfe1b99f0"

RPROVIDES:${PN} += "python312-testsuite \
python312-testsuite(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python312 \
python312-tk"

inherit rpm
