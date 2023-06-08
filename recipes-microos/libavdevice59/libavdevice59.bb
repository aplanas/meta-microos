SUMMARY = "FFmpeg device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libavdevice59-5.1.3-1.1.aarch64.rpm"
RPM_HASH = "a8b6d74e497a67f9498547d09581f68ae29c3315c5fbc257ea3429f58d91d2af9bddc4f66469e40f94563d8f01fe61a910fcccbf7c8d8de6b8a2319e0dac49c3"

RPROVIDES:${PN} += "libavdevice.so.59()(64bit) libavdevice.so.59(LIBAVDEVICE_59.7_SUSE)(64bit) libavdevice59 libavdevice59(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libSDL2-2.0.so.0()(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libavcodec.so.59()(64bit) libavcodec.so.59(LIBAVCODEC_59.37_SUSE)(64bit) libavcodec59 libavfilter.so.8()(64bit) libavfilter.so.8(LIBAVFILTER_8.44_SUSE)(64bit) libavfilter8 libavformat.so.59()(64bit) libavformat.so.59(LIBAVFORMAT_59.27_SUSE)(64bit) libavformat59 libavutil.so.57()(64bit) libavutil.so.57(LIBAVUTIL_57.28_SUSE)(64bit) libavutil57 libc.so.6(GLIBC_2.34)(64bit) libcdio_cdda.so.2()(64bit) libcdio_cdda.so.2(CDIO_CDDA_2)(64bit) libcdio_paranoia.so.2()(64bit) libcdio_paranoia.so.2(CDIO_PARANOIA_2)(64bit) libdc1394.so.25()(64bit) libdrm.so.2()(64bit) libjack.so.0()(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libxcb-shape.so.0()(64bit) libxcb-shm.so.0()(64bit) libxcb-xfixes.so.0()(64bit) libxcb.so.1()(64bit)"

inherit rpm
