SUMMARY = "High quality, one-dimensional sample-rate conversion library"
DESCRIPTION = "High quality, one-dimensional sample-rate conversion library"
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.5"

RPM_NAME = "python310-soxr-0.3.5-1.1.aarch64.rpm"
RPM_HASH = "bbbf744ea3a1cb099d4309baf3acbbe20bc809ae877493109fd5136dc1b09a5140bf0064c73beff38d749047e71eb501fe24d4fef2b16a8591c8095a41a1c94a"

RPROVIDES:${PN} += "python3-soxr \
python3.10dist(soxr) \
python310-soxr \
python310-soxr(aarch-64) \
python3dist(soxr)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libsoxr.so.0()(64bit) \
python(abi) \
python310-numpy"

inherit rpm
