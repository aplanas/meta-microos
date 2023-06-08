SUMMARY = "A Python XML Interface"
DESCRIPTION = "The expat module is a Python interface to the expat XML parser. Since \
Python2.x, it is part of the core Python distribution."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-xml-2.7.18-33.1.aarch64.rpm"
RPM_HASH = "d61e317a6dbd0bd6ed4f9420d8aab09ac2a0a23d4d7dcc8695de69b7384308de599159916d16ebf55a1aa90d0f9fb98248e7bdb91a80597280cdce3a75b0961c"

RPROVIDES:${PN} += "python-xml python-xml(aarch-64) python2-xml pyxml"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpython2.7.so.1.0()(64bit) python(abi) python-base"

inherit rpm
