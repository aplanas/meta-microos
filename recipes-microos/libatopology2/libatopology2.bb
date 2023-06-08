SUMMARY = "ALSA Topology Library"
DESCRIPTION = "This package contains the library for ALSA topology support."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.9"

RPM_NAME = "libatopology2-1.2.9-1.1.aarch64.rpm"
RPM_HASH = "7dda2c09a8e9bf31c02cc73b4fc014c7ab92e9119085d5c6df3ae65f6b7410f21f6043342afdb9965f610fc842523ad99bea7bc8c29b39e7d349d4d6e1d033ca"

RPROVIDES:${PN} += "libatopology.so.2()(64bit) libatopology.so.2(ALSA_0.9)(64bit) libatopology.so.2(ALSA_0.9.0)(64bit) libatopology.so.2(ALSA_0.9.0rc4)(64bit) libatopology.so.2(ALSA_0.9.0rc8)(64bit) libatopology.so.2(ALSA_0.9.3)(64bit) libatopology.so.2(ALSA_0.9.5)(64bit) libatopology.so.2(ALSA_0.9.7)(64bit) libatopology.so.2(ALSA_1.1.6)(64bit) libatopology.so.2(ALSA_1.2.6)(64bit) libatopology.so.2(ALSA_1.2.9)(64bit) libatopology2 libatopology2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libasound.so.2(ALSA_1.2.6)(64bit) libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
