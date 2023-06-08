SUMMARY = "Main output plugins for libao"
DESCRIPTION = "This package contains the main output plugins for libao."
LICENSE = "GPL-2.0+"

PV = "1.2.2+git20180114.d522165"

RPM_NAME = "libao-plugins4-1.2.2+git20180114.d522165-2.19.aarch64.rpm"
RPM_HASH = "dfab18634c423615cfab681102af82d8a9ce1326da6806f985f33dc8a152d80e86e1eb4187d2f61c098703270d3fa7b0acbee77fa1ce15cb0c6831476bf7a5a8"

RPROVIDES:${PN} += "libao-plugins4 libao-plugins4(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_0.9.0rc4)(64bit) libc.so.6(GLIBC_2.17)(64bit) libpulse-simple.so.0()(64bit) libpulse-simple.so.0(PULSE_0)(64bit) libpulse.so.0()(64bit) libpulse.so.0(PULSE_0)(64bit)"

inherit rpm
