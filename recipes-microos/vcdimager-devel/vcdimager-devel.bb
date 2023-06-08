SUMMARY = "Video CD (VCD) authoring software"
DESCRIPTION = "GNU VCDImager is a full-featured mastering suite for authoring, \
disassembling and analyzing Video CDs and Super Video CDs."
LICENSE = "GPL-2.0-only"

PV = "2.0.1"

RPM_NAME = "vcdimager-devel-2.0.1-3.11.aarch64.rpm"
RPM_HASH = "2b098b5a806c172bcc218c98c4cf6fab79f8db49808a351dff34ca9fbf0b8b919a814a01a2607eade582857722f97b19c655dad94e4c77b2bd9588ec8d348b5d"

RPROVIDES:${PN} += "pkgconfig(libvcdinfo) vcdimager-devel vcdimager-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libvcdinfo0 pkgconfig(libcdio)"

inherit rpm
