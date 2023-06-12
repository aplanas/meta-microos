SUMMARY = "Library for reading RAW files obtained from digital photo cameras"
DESCRIPTION = "LibRaw is a library for reading RAW files obtained from digital photo \
cameras (CRW/CR2, NEF, RAF, DNG, and others). \
 \
LibRaw is based on the source codes of the dcraw utility, where part of \
drawbacks have already been eliminated and part will be fixed in future. \
 \
This package contains static libraries that applications can use to build \
against LibRaw. LibRaw does not provide dynamic libraries."
LICENSE = "CDDL-1.0 | LGPL-2.1-only"

PV = "0.21.1"

RPM_NAME = "libraw-devel-static-0.21.1-2.1.aarch64.rpm"
RPM_HASH = "82472e840b4d2ded73a2b7f33e273a6b6d08f71d84c0a47661578c240904d1e4ac716321dd02a83b87a51169a6e5c9e9e8caf9ae19d5219f43537cedcbb405e1"

RPROVIDES:${PN} += "libraw-devel-static \
libraw-devel-static(aarch-64)"
RDEPENDS:${PN} += "libraw-devel"

inherit rpm
