SUMMARY = "Video player that gets sync from Jack"
DESCRIPTION = "Xjadeo is a video player that gets sync from JACK. When a \
sequencer like Muse or Rosegarden acts as a timebase master, xjadeo will \
display the video frame in sync with the sequencer transport. This means \
that an audio event can be visually synchronized with a certain frame in \
the movie, which may be useful for creating a soundtrack for \
a video clip."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.12"

RPM_NAME = "xjadeo-0.8.12-1.4.aarch64.rpm"
RPM_HASH = "94cced6c409d9a4bafc867339d53ab9d9207ef135c1178e809272f9d3d9b7fd7bdf6af637c0cab9cd0b9589481084e355a9818aaf04b12f787b14ce9772d75c4"

RPROVIDES:${PN} += "application() \
application(xjadeo.desktop) \
xjadeo \
xjadeo(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libImlib2.so.1()(64bit) \
libSDL-1.2.so.0()(64bit) \
libX11.so.6()(64bit) \
libXpm.so.4()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libavcodec.so.60()(64bit) \
libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) \
libavformat.so.60()(64bit) \
libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) \
libavutil.so.58()(64bit) \
libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libfreetype.so.6()(64bit) \
libjack.so.0()(64bit) \
liblo.so.7()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libswscale.so.7()(64bit) \
libswscale.so.7(LIBSWSCALE_7.1_SUSE)(64bit)"

inherit rpm
