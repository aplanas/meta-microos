SUMMARY = "Development files for libiec61883"
DESCRIPTION = "This library is an implementation of IEC 61883, part 1 (CIP, plug \
registers, and CMP), part 2 (DV-SD), part 4 (MPEG2-TS), and part 6 \
(AMDTP). Outside of IIDC, nearly all FireWire multimedia devices use \
IEC 61883 protocols. \
 \
The libiec61883 library provides a higher level API for streaming DV, \
MPEG-2 and audio over Linux IEEE 1394."
LICENSE = "LGPL-2.1+"

PV = "1.2.0"

RPM_NAME = "libiec61883-devel-1.2.0-8.26.aarch64.rpm"
RPM_HASH = "4fe74cb7f34afe004d33239b31aa4301f0d9edf0f9d7bd9bcd76a967ca23dd37cdc12237d35c5921dee08ccacb5ebd86a667b94087f86cd7deb79f480ac4509b"

RPROVIDES:${PN} += "libiec61883-devel libiec61883-devel(aarch-64) pkgconfig(libiec61883)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libiec61883-0 pkgconfig(libraw1394)"

inherit rpm
