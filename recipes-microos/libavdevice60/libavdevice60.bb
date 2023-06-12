SUMMARY = "FFmpeg device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libavdevice60-6.0-2.2.aarch64.rpm"
RPM_HASH = "0831ff68546a134098b22deaf5cf5d90135287b8988c48e7507f9cfca871a864c8c818fcab4f4e8ab638ad004f7598ec03929bbaa07e43af37374d7c80ed8e57"

RPROVIDES:${PN} += "libavdevice.so.60()(64bit) libavdevice.so.60(LIBAVDEVICE_60.1_SUSE)(64bit) libavdevice60 libavdevice60(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libavcodec.so.60()(64bit) libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) libavcodec60 libavfilter.so.9()(64bit) libavfilter.so.9(LIBAVFILTER_9.3_SUSE)(64bit) libavfilter9 libavformat.so.60()(64bit) libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) libavformat60 libavutil.so.58()(64bit) libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) libavutil58 libc.so.6(GLIBC_2.34)(64bit) libcdio_cdda.so.2()(64bit) libcdio_cdda.so.2(CDIO_CDDA_2)(64bit) libcdio_paranoia.so.2()(64bit) libcdio_paranoia.so.2(CDIO_PARANOIA_2)(64bit) libdc1394.so.25()(64bit) libdrm.so.2()(64bit) libjack.so.0()(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libxcb-shape.so.0()(64bit) libxcb-shm.so.0()(64bit) libxcb-xfixes.so.0()(64bit) libxcb.so.1()(64bit)"

inherit rpm
