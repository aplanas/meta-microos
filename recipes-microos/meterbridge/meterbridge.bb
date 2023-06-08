SUMMARY = "A Meterbridge for the JACK Audio System"
DESCRIPTION = "Meterbridge is a JACK (JACK Audio Connection Kit) client for \
visualizing audio signals."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.3"

RPM_NAME = "meterbridge-0.9.3-1.8.aarch64.rpm"
RPM_HASH = "6f6dfb89ccaf5f14ce69d1fbff54c3db2ae17971d771d15b9429af613297d3d483a11635f3769a1306505736a8a96a11be8f68138ad0747847888f48f21ca199"

RPROVIDES:${PN} += "application() application(meterbridge.desktop) meterbridge meterbridge(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libGL.so.1()(64bit) libSDL-1.2.so.0()(64bit) libSDL_image-1.2.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libjack.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.27)(64bit)"

inherit rpm
