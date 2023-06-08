SUMMARY = "Python Bindings for the low-level FUSE3 API"
DESCRIPTION = "pyfuse3 is a set of Python 3 bindings for libfuse 3. It provides an asynchronous API compatible with Trio and asyncio, and enables you to easily write a full-featured Linux filesystem in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.2"

RPM_NAME = "python311-pyfuse3-3.2.2-1.5.aarch64.rpm"
RPM_HASH = "0ef02ca558cc6e89cdc65da43b5353c4fc36a7bbd63e6fdd126344fc4347beb3f05778ab79719ada2ae868cd8705318d4143c316cccd1b8baa6b94ba5f9eafd7"

RPROVIDES:${PN} += "python3.11dist(pyfuse3) python311-pyfuse3 python311-pyfuse3(aarch-64) python3dist(pyfuse3)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libfuse3.so.3()(64bit) libfuse3.so.3(FUSE_3.0)(64bit) python(abi) python311-trio"

inherit rpm
