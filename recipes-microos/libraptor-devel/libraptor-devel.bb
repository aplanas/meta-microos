SUMMARY = "Development package for the raptor library"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
raptor library."
LICENSE = "LGPL-2.1-or-later | GPL-2.0-or-later | Apache-2.0"

PV = "2.0.15"

RPM_NAME = "libraptor-devel-2.0.15-3.17.aarch64.rpm"
RPM_HASH = "da79f50232d1dcdf4398f4c3ad8441860d806627f32d50cbef8bdba7b5c1d8634693245ad08e7462bd06377fd4924f9b623d7410021584512d35111fff693933"

RPROVIDES:${PN} += "libraptor-devel libraptor-devel(aarch-64) pkgconfig(raptor2) raptor-devel"
RDEPENDS:${PN} += "/usr/bin/pkg-config glibc-devel libraptor2-0 raptor"

inherit rpm
