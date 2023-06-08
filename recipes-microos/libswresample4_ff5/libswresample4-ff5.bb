SUMMARY = "FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libswresample4_ff5-5.1.3-1.1.aarch64.rpm"
RPM_HASH = "de6e5e2d7513d3b790460936099c16de65bef77454dcd218d5e82e5a21922cd99a942fb616a3becd7b894387ba532d3f26f1d9b266ffb6b9c32e3130c0cdb632"

RPROVIDES:${PN} += "libswresample.so.4.ff5()(64bit) libswresample.so.4.ff5(LIBSWRESAMPLE_4.7_SUSE)(64bit) libswresample4_ff5 libswresample4_ff5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavutil.so.57()(64bit) libavutil.so.57(LIBAVUTIL_57.28_SUSE)(64bit) libavutil57 libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libsoxr.so.0()(64bit)"

inherit rpm
