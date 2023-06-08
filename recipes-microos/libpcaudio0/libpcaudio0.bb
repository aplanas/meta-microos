SUMMARY = "Cross platform audio library"
DESCRIPTION = "The Portable C Audio Library (pcaudiolib) provides a C API to different audio devices."
LICENSE = "GPL-3.0-or-later"

PV = "1.2"

RPM_NAME = "libpcaudio0-1.2-1.5.aarch64.rpm"
RPM_HASH = "8bcc6ec1eabb3650970cf278a0d51196a2de0b006002500064627b2842e21cfd37a5b477c3d095ca745296faade5aee2eae165b54d791cd1061f7eda2b1530db"

RPROVIDES:${PN} += "libpcaudio.so.0()(64bit) libpcaudio0 libpcaudio0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpulse-simple.so.0()(64bit) libpulse-simple.so.0(PULSE_0)(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit)"

inherit rpm
