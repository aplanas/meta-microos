SUMMARY = "Python bindings for FUSE"
DESCRIPTION = "Python bindings for FUSE (User space File System)"
LICENSE = "LGPL-2.1-only"

PV = "1.0.5"

RPM_NAME = "python39-fuse-1.0.5-1.4.aarch64.rpm"
RPM_HASH = "0bb681f1abb8c2183a1ef9713ed08d6039d2ce9468f33bfb5b00349974d4759dcebb25fd392dc3a2b9e3ee9cea82e9ed449b21276132ba95f2b095e8356df27c"

RPROVIDES:${PN} += "python3.9dist(fuse-python) python39-fuse python39-fuse(aarch-64) python3dist(fuse-python)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libfuse.so.2()(64bit) libfuse.so.2(FUSE_2.2)(64bit) libfuse.so.2(FUSE_2.6)(64bit) libfuse.so.2(FUSE_2.8)(64bit) python(abi)"

inherit rpm
