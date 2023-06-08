SUMMARY = "Functions to control oepration of a CD-ROM while playing audio CDs"
DESCRIPTION = "libcdaudio is a library providing functions to control \
operation of a CD-ROM when playing audio CDs.  It also contains \
functions for CDDB and CD index lookup."
LICENSE = "GPL-2.0-or-later"

PV = "0.99.12p2"

RPM_NAME = "libcdaudio1-0.99.12p2-2.8.aarch64.rpm"
RPM_HASH = "593d400542a640cf436cc8a94baf7844a49c80e7c84094b5df4ade41a28a145b0e39d028540fcc4caea94c29d1ca42c040d9034add3c45cc9a25cfddef97c447"

RPROVIDES:${PN} += "libcdaudio libcdaudio.so.1()(64bit) libcdaudio1 libcdaudio1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm
