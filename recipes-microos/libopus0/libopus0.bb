SUMMARY = "Opus Audio Codec Library"
DESCRIPTION = "The Opus codec is designed for interactive speech and audio transmission over \
the Internet. It is designed by the IETF Codec Working Group and incorporates \
technology from Skype's SILK codec and Xiph.Org's CELT codec."
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "libopus0-1.4-1.1.aarch64.rpm"
RPM_HASH = "8c396d6052c6a6a32c84e3cd2f70f1591171bc1cda3c29a5737f288bfc559ed5f3e642b590d95ebd3a31552f26f4a4af0ecf67ac9598cbb15f31a99a60129cfd"

RPROVIDES:${PN} += "libopus.so.0()(64bit) \
libopus0 \
libopus0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
