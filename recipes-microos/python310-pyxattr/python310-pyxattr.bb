SUMMARY = "Filesystem extended attributes for python"
DESCRIPTION = "This is a C extension module for Python which \
implements extended attributes manipulation. It is a wrapper on top \
of the attr C library - see attr(5)."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.2"

RPM_NAME = "python310-pyxattr-0.7.2-1.13.aarch64.rpm"
RPM_HASH = "6e1422c230a8a421c9e74ec0d1fcb267a8df99bafdd4197d791bf07f75be755f1b2895eeb7a574a312c6a302015589ec5084f82e6d2d425f970d505a2a6394d4"

RPROVIDES:${PN} += "python3-pyxattr python3.10dist(pyxattr) python310-pyxattr python310-pyxattr(aarch-64) python3dist(pyxattr)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi)"

inherit rpm
