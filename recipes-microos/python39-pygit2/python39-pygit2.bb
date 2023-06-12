SUMMARY = "Python bindings for libgit2"
DESCRIPTION = "Bindings for libgit2, a linkable C library for the Git version-control system."
LICENSE = "GPL-2.0-only"

PV = "1.11.1"

RPM_NAME = "python39-pygit2-1.11.1-2.2.aarch64.rpm"
RPM_HASH = "613a15a922488c6234deb309c94ec4b04226971d68e2237e899e7a3e7374c6f71f1a2f20f3c6d9ff4e1238f9c7a61891ea799b5b7c51c188068f30ecce78096b"

RPROVIDES:${PN} += "python3.9dist(pygit2) \
python39-pygit2 \
python39-pygit2(aarch-64) \
python3dist(pygit2)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgit2.so.1.6()(64bit) \
python(abi) \
python39-cached-property \
python39-cffi"

inherit rpm
