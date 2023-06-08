SUMMARY = "Python Bindings for the low-level FUSE API"
DESCRIPTION = "LLFUSE is a set of Python bindings for the low level FUSE API. It requires at \
least FUSE 2.8.0 and supports both Python 2.x and 3.x. \
 \
LLFUSE was originally part of S3QL, but has been factored out so that it can be \
used by other projects as well."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "python39-llfuse-1.4.2-1.6.aarch64.rpm"
RPM_HASH = "0f9ba662cd0efffdb3e278359088e744862806e796aad64126a336980be575c1286117670a02134652aa4c91b099ca16274279f7051718d60b9872c2f9c6cb26"

RPROVIDES:${PN} += "python3.9dist(llfuse) python39-llfuse python39-llfuse(aarch-64) python3dist(llfuse)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfuse.so.2()(64bit) libfuse.so.2(FUSE_2.4)(64bit) libfuse.so.2(FUSE_2.5)(64bit) libfuse.so.2(FUSE_2.6)(64bit) libfuse.so.2(FUSE_2.8)(64bit) libfuse.so.2(FUSE_2.9)(64bit) python(abi)"

inherit rpm
