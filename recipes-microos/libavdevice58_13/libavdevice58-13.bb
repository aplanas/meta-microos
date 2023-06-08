SUMMARY = "FFmpeg device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libavdevice58_13-4.4.4-1.1.aarch64.rpm"
RPM_HASH = "53daa06c6279c18e388247166b94937a749e5731937413f7d16ea329c0a78ccfa675a6132febe79ccac30d14a3e762f82228114ecb02afcd558dde764827b823"

RPROVIDES:${PN} += "libavdevice.so.58.13()(64bit) libavdevice.so.58.13(LIBAVDEVICE_58)(64bit) libavdevice58_13 libavdevice58_13(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libavcodec.so.58.134()(64bit) libavcodec.so.58.134(LIBAVCODEC_58)(64bit) libavcodec58_134 libavfilter.so.7.110()(64bit) libavfilter.so.7.110(LIBAVFILTER_7)(64bit) libavfilter7_110 libavformat.so.58.76()(64bit) libavformat.so.58.76(LIBAVFORMAT_58)(64bit) libavformat58_76 libavutil.so.56.70()(64bit) libavutil.so.56.70(LIBAVUTIL_56)(64bit) libavutil56_70 libc.so.6(GLIBC_2.34)(64bit) libcdio_cdda.so.2()(64bit) libcdio_cdda.so.2(CDIO_CDDA_2)(64bit) libcdio_paranoia.so.2()(64bit) libcdio_paranoia.so.2(CDIO_PARANOIA_2)(64bit) libdc1394.so.25()(64bit) libdrm.so.2()(64bit) libjack.so.0()(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libv4l2.so.0()(64bit) libxcb-shape.so.0()(64bit) libxcb-shm.so.0()(64bit) libxcb-xfixes.so.0()(64bit) libxcb.so.1()(64bit)"

inherit rpm
