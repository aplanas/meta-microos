SUMMARY = "An open source re-implementation of Caesar III"
DESCRIPTION = "Julius is an open source re-implementation of Caesar III. \
 \
The aim of this project is to create an open-source version of \
Caesar 3, with the same logic as the original, but with some UI \
enhancements, that is able to be played on multiple platforms. \
 \
The same logic means that the saved games are 100% compatible, \
and any gameplay bugs present in the original Caesar 3 game will \
also be present in Julius. \
 \
UI enhancements include: \
 \
* Support for widescreen resolutions \
* Windowed mode support for 32-bit desktops \
 \
Julius requires the original assets (graphics, sounds, etc) from \
Caesar 3 to run."
LICENSE = "GPL-3.0-only"

PV = "1.7.0"

RPM_NAME = "julius-1.7.0-1.10.aarch64.rpm"
RPM_HASH = "be98baa6fb31739e713c47dbafcf202739b811a227bcca840b15cdd1e0610fc05ade5e2939cb00cbe7cf3c396a815897718bc5b631f23f1721b673c1adb63236"

RPROVIDES:${PN} += "application() \
application(com.github.bvschaik.julius.desktop) \
julius \
julius(aarch-64) \
metainfo() \
metainfo(com.github.bvschaik.julius.metainfo.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.7)(64bit) \
libSDL2-2.0.so.0(SUSE_2.24.0)(64bit) \
libSDL2_mixer-2.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit)"

inherit rpm
