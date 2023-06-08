SUMMARY = "Python bindings for wc(s)width"
DESCRIPTION = "Python bindings for wc(s)width"
LICENSE = "MIT"

PV = "0.1.8"

RPM_NAME = "python310-cwcwidth-0.1.8-1.5.aarch64.rpm"
RPM_HASH = "e5bede93c6ff9cf0cdee0496d5be9acfdb37746e1a61f3f678466327b98a2123ed7e98c2e29019ca25fc5f91f336930722db475d7dfc76b683dbb1020829fd52"

RPROVIDES:${PN} += "python3-cwcwidth python3.10dist(cwcwidth) python310-cwcwidth python310-cwcwidth(aarch-64) python3dist(cwcwidth)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
