SUMMARY = "FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libswresample4-6.0-2.1.aarch64.rpm"
RPM_HASH = "6866818943f6d7ceb3e615e3fbf6f23e7210302809dc492d3642bf573d3a12676d06f599617277bf47fe1f5100810bc143142b4355545838b22ffb65110af336"

RPROVIDES:${PN} += "libswresample.so.4()(64bit) libswresample.so.4(LIBSWRESAMPLE_4.10_SUSE)(64bit) libswresample4 libswresample4(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavutil.so.58()(64bit) libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) libavutil58 libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libsoxr.so.0()(64bit)"

inherit rpm
