SUMMARY = "Python 3 libraries for Ceph distributed file system"
DESCRIPTION = "This package contains Python 3 libraries for interacting with Ceph distributed \
file system."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "python3-cephfs-16.2.11.65+g8b7e6fc0182-1.1.aarch64.rpm"
RPM_HASH = "b0bad51d14f6f2c40d34f742531391ac75cb4a499fcd124721f0b021c9865115e1a4cb946f5fe5f58c1004dd476fab4ee1135a3cb1a600b39e9e139d163f1350"

RPROVIDES:${PN} += "python-cephfs python3-cephfs python3-cephfs(aarch-64) python3.10dist(cephfs) python3dist(cephfs)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcephfs.so.2()(64bit) libcephfs2 python(abi) python3-ceph-argparse python3-rados"

inherit rpm
