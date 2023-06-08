SUMMARY = "Python 3 libraries for the RADOS block device"
DESCRIPTION = "This package contains Python 3 libraries for interacting with Ceph RADOS \
block device."
LICENSE = "LGPL-2.1 & LGPL-3.0 & CC-BY-SA-3.0 & GPL-2.0 & BSL-1.0 & BSD-3-Clause & MIT"

PV = "16.2.11.65+g8b7e6fc0182"

RPM_NAME = "python3-rbd-16.2.11.65+g8b7e6fc0182-1.1.aarch64.rpm"
RPM_HASH = "38f6988692fd471114865afe27a91079fb4fed2c3dc77236ff63a7769227da1828467eb36a454c36ce74e00a539b5f8f6d6bbfaeca31f804c956430c2e862d46"

RPROVIDES:${PN} += "python-rbd python3-rbd python3-rbd(aarch-64) python3.10dist(rbd) python3dist(rbd)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) librbd.so.1()(64bit) librbd1 python(abi) python3-rados"

inherit rpm
