SUMMARY = "FFmpeg's utility library"
DESCRIPTION = "The libavutil library is a utility library to aid portable multimedia \
programming. It contains safe portable string functions, random \
number generators, data structures, additional mathematics functions, \
cryptography and multimedia related functionality (like enumerations \
for pixel and sample formats)."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libavutil58-6.0-2.1.aarch64.rpm"
RPM_HASH = "e5f3e0f24d72458a9eddf9aec0ffb996ca852641fa605e2b22686bde356f88a1a1073941d1c911185189e03b53b28205f77d084f32e82d97aa9495e45b863052"

RPROVIDES:${PN} += "libavutil.so.58()(64bit) libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) libavutil58 libavutil58(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdrm.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libva-drm.so.2()(64bit) libva-x11.so.2()(64bit) libva.so.2()(64bit) libva.so.2(VA_API_0.33.0)(64bit) libvdpau.so.1()(64bit)"

inherit rpm
