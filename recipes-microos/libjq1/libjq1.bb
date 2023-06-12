SUMMARY = "Library for a lightweight and flexible command-line JSON processor"
DESCRIPTION = "Library for a lightweight and flexible command-line JSON processor."
LICENSE = "CC-BY-3.0 & MIT"

PV = "1.6"

RPM_NAME = "libjq1-1.6-3.3.aarch64.rpm"
RPM_HASH = "bd2321bff562c8856101f1d4c18a40cf135f6d98045f2db66c4c591f623f7d2f1a763e0e83cf776d40c93bf4ebab775d1033151a9a1ec214b6cefd424d176dd3"

RPROVIDES:${PN} += "libjq.so.1()(64bit) \
libjq1 \
libjq1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.23)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libonig.so.5()(64bit)"

inherit rpm
