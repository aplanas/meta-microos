SUMMARY = "Python 3 libraries for the RADOS gateway"
DESCRIPTION = "This package contains Python 3 libraries for interacting with Ceph RADOS \
gateway."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.13.66+g54799ee0666"

RPM_NAME = "python3-rgw-16.2.13.66+g54799ee0666-2.1.aarch64.rpm"
RPM_HASH = "036a6b06483ef66d9431ee9bbc014e495e7e5e3746bd5eafce9ce57134ad386185ee6d5e6e5802bbba1c1e0cbc2d3e754639a7bedf9e9360732fa16701e21772"

RPROVIDES:${PN} += "python-rgw python3-rgw python3-rgw(aarch-64) python3.10dist(rgw) python3dist(rgw)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) librgw.so.2()(64bit) librgw2 python(abi) python3-rados"

inherit rpm
