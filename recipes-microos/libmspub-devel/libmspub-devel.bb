SUMMARY = "Files for Developing with libmspub"
DESCRIPTION = "libmspub is a library for parsing the Microsoft Publisher file format structure. \
 \
This package contains the libmspub development files."
LICENSE = "MPL-2.0"

PV = "0.1.4"

RPM_NAME = "libmspub-devel-0.1.4-2.24.aarch64.rpm"
RPM_HASH = "f11898af27ef12cf3e17707fa866dd20a99970ee322cbcd8b3a920eacfb4bb53f56f74f584245f357fbeb2a8b414fa800f67ff773f4e40e11101714ce8b47b05"

RPROVIDES:${PN} += "libmspub-devel libmspub-devel(aarch-64) pkgconfig(libmspub-0.1)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libmspub-0_1-1 pkgconfig(icu-i18n) pkgconfig(librevenge-0.0) pkgconfig(zlib)"

inherit rpm
