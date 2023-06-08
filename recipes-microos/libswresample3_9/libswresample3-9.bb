SUMMARY = "FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libswresample3_9-4.4.4-1.1.aarch64.rpm"
RPM_HASH = "755905e21f6cd30cb718411027b7ff53e0c03d44b1e7f18ae0dc527fbce21050cda7907fd0e9a7faf4f57ee88ad0a555b7c568ad4b4a9dd30bd948849ee3128f"

RPROVIDES:${PN} += "libswresample.so.3.9()(64bit) libswresample.so.3.9(LIBSWRESAMPLE_3)(64bit) libswresample3_9 libswresample3_9(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libavutil.so.56.70()(64bit) libavutil.so.56.70(LIBAVUTIL_56)(64bit) libavutil56_70 libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libsoxr.so.0()(64bit)"

inherit rpm
