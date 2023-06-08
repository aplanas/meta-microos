SUMMARY = "FFmpeg's utility library"
DESCRIPTION = "The libavutil library is a utility library to aid portable multimedia \
programming. It contains safe portable string functions, random \
number generators, data structures, additional mathematics functions, \
cryptography and multimedia related functionality (like enumerations \
for pixel and sample formats)."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libavutil57-5.1.3-1.1.aarch64.rpm"
RPM_HASH = "e71bbcb4e1fd59383f2e3e54b05a6fdf9828351ec6b4a97fe9e7a31e7fe9f8256656fb8d3c893ac127c4730b1e4a16060756cfdad7298cf7e75e427b22b2c9b9"

RPROVIDES:${PN} += "libavutil.so.57()(64bit) libavutil.so.57(LIBAVUTIL_57.28_SUSE)(64bit) libavutil57 libavutil57(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdrm.so.2()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libva-drm.so.2()(64bit) libva-x11.so.2()(64bit) libva.so.2()(64bit) libva.so.2(VA_API_0.33.0)(64bit) libvdpau.so.1()(64bit)"

inherit rpm
