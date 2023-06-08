SUMMARY = "Portable Real-Time Audio Library"
DESCRIPTION = "PortAudio is a portable audio I/O library designed for cross-platform \
support of audio. It uses a callback mechanism to request audio \
processing. Audio can be generated in various formats, including 32 bit \
floating point, and will be converted to the native format internally."
LICENSE = "MIT"

PV = "190700_20210406"

RPM_NAME = "libportaudio2-190700_20210406-1.8.aarch64.rpm"
RPM_HASH = "989be3a34a9b49feb09781f6acd72a27c01bb9ce2f96bc5d4191a6a016ba59b4b9d1c7f027329c1acbc3190ec89c524fb628e4107361fa2579c18d5bc778cc5a"

RPROVIDES:${PN} += "libportaudio.so.2()(64bit) libportaudio2 libportaudio2(aarch-64) portaudio"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libjack.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
