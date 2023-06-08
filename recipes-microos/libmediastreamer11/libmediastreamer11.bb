SUMMARY = "Audio/video real-time streaming library, base part"
DESCRIPTION = "Mediastreamer2 is a library to make audio and video real-time \
streaming and processing. It is written in pure C and based upon the \
oRTP library."
LICENSE = "AGPL-3.0-or-later"

PV = "5.2.49"

RPM_NAME = "libmediastreamer11-5.2.49-1.2.aarch64.rpm"
RPM_HASH = "b1086d7a04fc03cfc48352cbad6eacb56d8f6cfbfa9a00f577d233f4204f621cbc83c58c94556260dc0d7439680a9ef59e75d7be55d0bcf4ffd245a8945864d1"

RPROVIDES:${PN} += "libmediastreamer.so.11()(64bit) libmediastreamer11 libmediastreamer11(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libGLEW.so.2.2()(64bit) libX11.so.6()(64bit) libXv.so.1()(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libavcodec.so.60()(64bit) libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) libavutil.so.58()(64bit) libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) libbcg729.so.0()(64bit) libbcmatroska2.so.0()(64bit) libbctoolbox.so.1()(64bit) libbv16.so()(64bit) libbzrtp.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgsm.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit) libm.so.6(GLIBC_2.29)(64bit) libopus.so.0()(64bit) libortp.so.15()(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit) libspeex.so.1()(64bit) libspeexdsp.so.1()(64bit) libsrtp2-linphone.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libswscale.so.7()(64bit) libswscale.so.7(LIBSWSCALE_7.1_SUSE)(64bit) libtheora.so.0()(64bit) libtheora.so.0(libtheora.so.1.0)(64bit) libturbojpeg.so.0()(64bit) libturbojpeg.so.0(TURBOJPEG_1.0)(64bit) libturbojpeg.so.0(TURBOJPEG_1.2)(64bit) libturbojpeg.so.0(TURBOJPEG_1.4)(64bit) libturbojpeg.so.0(TURBOJPEG_2.0)(64bit) libvpx.so.8()(64bit)"

inherit rpm
