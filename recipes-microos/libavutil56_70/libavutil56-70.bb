SUMMARY = "FFmpeg's utility library"
DESCRIPTION = "The libavutil library is a utility library to aid portable multimedia \
programming. It contains safe portable string functions, random \
number generators, data structures, additional mathematics functions, \
cryptography and multimedia related functionality (like enumerations \
for pixel and sample formats)."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libavutil56_70-4.4.4-1.1.aarch64.rpm"
RPM_HASH = "964bd80abfbfbf5e985a53ebbfb7b35d6ca77d85f3066a53c85d7523f0f98a294d48e507653672292058a7ba91583b0bf1cb30f85b1867ab04ef8309a27e5a88"

RPROVIDES:${PN} += "libavutil.so.56.70()(64bit) libavutil.so.56.70(LIBAVUTIL_56)(64bit) libavutil56_70 libavutil56_70(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdrm.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libva-drm.so.2()(64bit) libva.so.2()(64bit) libva.so.2(VA_API_0.33.0)(64bit) libvdpau.so.1()(64bit) libvulkan.so.1()(64bit)"

inherit rpm
