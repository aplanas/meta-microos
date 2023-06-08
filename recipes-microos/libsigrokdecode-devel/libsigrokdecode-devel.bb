SUMMARY = "Protocol Decoder Library for sigrok"
DESCRIPTION = "The sigrok project aims at creating a portable, cross-platform, \
Free/Libre/Open-Source logic analyzer software that supports various \
logic analyzer hardware products. \
 \
libsigrokdecode is a shared library written in C which provides the basic \
API for running sigrok protocol decoders. The protocol decoders themselves \
are written in Python."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.3"

RPM_NAME = "libsigrokdecode-devel-0.5.3-2.4.aarch64.rpm"
RPM_HASH = "b23b81783a357514efd335aaf6f17c3023c0a334978e633609eb17edff2e0908b2a563d634de27880eae7849c07cb6a607f8b63508d32187203b6b759dd31ea3"

RPROVIDES:${PN} += "libsigrokdecode-devel libsigrokdecode-devel(aarch-64) pkgconfig(libsigrokdecode)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libsigrokdecode4 pkgconfig(glib-2.0) pkgconfig(python3-embed) python3-devel"

inherit rpm
