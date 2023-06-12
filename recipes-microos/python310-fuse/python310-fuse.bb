SUMMARY = "Python bindings for FUSE"
DESCRIPTION = "Python bindings for FUSE (User space File System)"
LICENSE = "LGPL-2.1-only"

PV = "1.0.5"

RPM_NAME = "python310-fuse-1.0.5-1.4.aarch64.rpm"
RPM_HASH = "bb831b0354744583da47789eaee65999d425a4dfded08a893e46e03a9712ad4d80bbe794d8bf8f96040cdb1b37ce80972e648f3d48bf03dbb0ae55f9e73268b2"

RPROVIDES:${PN} += "python3-fuse \
python3.10dist(fuse-python) \
python310-fuse \
python310-fuse(aarch-64) \
python3dist(fuse-python)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libfuse.so.2()(64bit) \
libfuse.so.2(FUSE_2.2)(64bit) \
libfuse.so.2(FUSE_2.6)(64bit) \
libfuse.so.2(FUSE_2.8)(64bit) \
python(abi)"

inherit rpm
