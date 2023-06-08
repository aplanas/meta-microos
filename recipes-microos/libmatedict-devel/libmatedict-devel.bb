SUMMARY = "Header files for MATE's dictionary library"
DESCRIPTION = "The matedict library is an engine to look up words in dictionary sources. \
This package contains development files for libmatedict."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "libmatedict-devel-1.26.0-1.11.aarch64.rpm"
RPM_HASH = "ec09d64d4cfe5384cda1c1d69e828dd82e2ec94b9969d9c3a719dbaaa42d617b5b97af1e77815c152dc2f250df86b5d8dd74a5543259daad6f877334bd82e77b"

RPROVIDES:${PN} += "libmatedict-devel libmatedict-devel(aarch-64) pkgconfig(mate-dict)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmatedict6 pkgconfig(gtk+-3.0)"

inherit rpm
