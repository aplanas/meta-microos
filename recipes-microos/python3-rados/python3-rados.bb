SUMMARY = "Python 3 libraries for the RADOS object store"
DESCRIPTION = "This package contains Python 3 libraries for interacting with Ceph RADOS \
object store."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "python3-rados-16.2.11.65+g8b7e6fc0182-1.1.aarch64.rpm"
RPM_HASH = "ccf9d8917a5f8a0227252c0ff5418a1960d76e6edcd54edb20824e1dcc66e0b98c118eb3d8c1109e363c05d7c5e5563fcc189b4f21daddc74deb5fdb3d4620d1"

RPROVIDES:${PN} += "python-rados python3-rados python3-rados(aarch-64) python3.10dist(rados) python3dist(rados)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) librados.so.2()(64bit) librados.so.2(LIBRADOS_14.2.0)(64bit) librados2 python(abi) python3"

inherit rpm
