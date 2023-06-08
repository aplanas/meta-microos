SUMMARY = "Access Java classes from Python"
DESCRIPTION = "Access Java classes from Python."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python39-pyjnius-1.4.2-2.4.aarch64.rpm"
RPM_HASH = "22e896b66b3786c49a78556a19f681f9d0f8c24f97cbb85bf94087c6c5f82f6bac4c7bc3c1a34ba7eaaa9b7a42d13d52665b83a37e1d305a791f21d77c9ab628"

RPROVIDES:${PN} += "python3.9dist(pyjnius) python39-pyjnius python39-pyjnius(aarch-64) python3dist(pyjnius)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) python(abi) python39-Cython"

inherit rpm
