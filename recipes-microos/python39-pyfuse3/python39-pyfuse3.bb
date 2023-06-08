SUMMARY = "Python Bindings for the low-level FUSE3 API"
DESCRIPTION = "pyfuse3 is a set of Python 3 bindings for libfuse 3. It provides an asynchronous API compatible with Trio and asyncio, and enables you to easily write a full-featured Linux filesystem in Python."
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.2"

RPM_NAME = "python39-pyfuse3-3.2.2-1.5.aarch64.rpm"
RPM_HASH = "de7481cc214f0e1d601686c3a362976000f6a37e99378f08a2b4f2eacb27664761dd3eeb467bf87c22e1ad8af27fcbd6721e8c3dd8b63e64fa44c4a83049742b"

RPROVIDES:${PN} += "python3.9dist(pyfuse3) python39-pyfuse3 python39-pyfuse3(aarch-64) python3dist(pyfuse3)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libfuse3.so.3()(64bit) libfuse3.so.3(FUSE_3.0)(64bit) python(abi) python39-trio"

inherit rpm
