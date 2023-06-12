SUMMARY = "Development files and tools for SFCGAL applications"
DESCRIPTION = "Content headers & files to envelopment files for libSFCGAL1"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "sfcgal-devel-1.4.1-4.4.aarch64.rpm"
RPM_HASH = "40c6b50a63a45ecff1d7a430b1d5bad92cd87ada5a59d97e849c280416d1b2ed10f2fb7f30abd9b836b8f02e3c279b6e0e793a9dffb16a2bc1ff76baa80360c2"

RPROVIDES:${PN} += "pkgconfig(sfcgal) \
sfcgal-devel \
sfcgal-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
libSFCGAL1"

inherit rpm
