SUMMARY = "Python Bindings for the low-level FUSE3 API"
DESCRIPTION = "pyfuse3 is a set of Python 3 bindings for libfuse 3. It provides an asynchronous API compatible with Trio and asyncio, and enables you to easily write a full-featured Linux filesystem in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.2"

RPM_NAME = "python310-pyfuse3-3.2.2-1.5.aarch64.rpm"
RPM_HASH = "0a54da8934cf710f1e1ee1980c9bda6042ff963df9ac2e462ef7c55099db40cfbd2862ef614c131efe61e8e292a6bce419647e0cbd9cd2c23a8081cccf99b9d5"

RPROVIDES:${PN} += "python3-pyfuse3 python3.10dist(pyfuse3) python310-pyfuse3 python310-pyfuse3(aarch-64) python3dist(pyfuse3)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libfuse3.so.3()(64bit) libfuse3.so.3(FUSE_3.0)(64bit) python(abi) python310-trio"

inherit rpm
