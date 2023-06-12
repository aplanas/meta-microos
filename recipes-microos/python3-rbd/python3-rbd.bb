SUMMARY = "Python 3 libraries for the RADOS block device"
DESCRIPTION = "This package contains Python 3 libraries for interacting with Ceph RADOS \
block device."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "python3-rbd-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "5f2927ab9b25087e82b8ae0ef29e71148b5324138108473ebb3d8d8585274d9fb40f37f525f64dc55d19c0498e24c4021d9368c4986674a177c3218666516041"

RPROVIDES:${PN} += "python-rbd python3-rbd python3-rbd(aarch-64) python3.10dist(rbd) python3dist(rbd)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) librbd.so.1()(64bit) librbd1 python(abi) python3-rados"

inherit rpm
