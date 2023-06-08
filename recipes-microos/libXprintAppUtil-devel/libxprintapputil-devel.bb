SUMMARY = "Development files for the Xprint application utility routines"
DESCRIPTION = "libxprintapputil provides utility Xpau APIs allowing client \
applications to access information about and control Xprint jobs from \
an Xprint server. \
 \
This package contains the development headers for the library found \
in libXprintAppUtil1."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "libXprintAppUtil-devel-1.0.1-13.1.aarch64.rpm"
RPM_HASH = "37f951882de1276f3e9e4026ceadb988ecdad0ccefe11b3c2fc0e78c5ac43582826b3c006f7e935ce0ff870b834b69555e38c2123e4c00f4c2de9e4d9af9fbc3"

RPROVIDES:${PN} += "libXprintAppUtil-devel libXprintAppUtil-devel(aarch-64) pkgconfig(xprintapputil)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libXprintAppUtil1 pkgconfig(x11) pkgconfig(xp) pkgconfig(xprintutil) pkgconfig(xproto)"

inherit rpm
