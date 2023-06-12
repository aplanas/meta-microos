SUMMARY = "Static libraries and header files from gtkspell"
DESCRIPTION = "Static libraries and header files from gtkspell."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.16"

RPM_NAME = "gtkspell-devel-2.0.16-23.9.aarch64.rpm"
RPM_HASH = "fe404fcb864f044508b221a2d00997e92153950476c2552b994116d82001aa39eaf865f6fe2260135619e5ee070054f2970b4e8d81c687f74eadc655508dd756"

RPROVIDES:${PN} += "gtkspell-devel \
gtkspell-devel(aarch-64) \
pkgconfig(gtkspell-2.0)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtkspell0 \
pkgconfig(gtk+-2.0)"

inherit rpm
