SUMMARY = "Python 3 libraries for the RADOS gateway"
DESCRIPTION = "This package contains Python 3 libraries for interacting with Ceph RADOS \
gateway."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "python3-rgw-16.2.11.65+g8b7e6fc0182-1.1.aarch64.rpm"
RPM_HASH = "6284c442e9e3f3b8b3c6b6a40a704a89bcdd04fbf7da05041af509593cb91f346347abe6e76e50168e7f559b6fe864cc50d4cc9f3512dfe98e3b1dcc316c0a5e"

RPROVIDES:${PN} += "python-rgw python3-rgw python3-rgw(aarch-64) python3.10dist(rgw) python3dist(rgw)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) librgw.so.2()(64bit) librgw2 python(abi) python3-rados"

inherit rpm
