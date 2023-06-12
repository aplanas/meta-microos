SUMMARY = "CLI tool to detect silence in audio-files"
DESCRIPTION = "Standalone application to analyze audio files for silence and \
print ranges of detected signals. \
 \
Silan uses ffmpeg/libav and supports a wide variety of audio \
codecs and formats."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.0"

RPM_NAME = "silan-0.4.0-2.2.aarch64.rpm"
RPM_HASH = "863a4a7179e18eae10bc65c98af35c1ea988b203cb2e858d1b2e68eb84a2b547c274f1e856fd47c370d407a465f0f746512c5a1d381a7136394c5c34d69a945a"

RPROVIDES:${PN} += "silan \
silan(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libavcodec.so.58.134()(64bit) \
libavcodec.so.58.134(LIBAVCODEC_58)(64bit) \
libavformat.so.58.76()(64bit) \
libavformat.so.58.76(LIBAVFORMAT_58)(64bit) \
libavutil.so.56.70()(64bit) \
libavutil.so.56.70(LIBAVUTIL_56)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit)"

inherit rpm
