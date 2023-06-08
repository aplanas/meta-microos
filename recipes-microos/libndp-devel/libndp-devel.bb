SUMMARY = "Libraries and header files for libndp development"
DESCRIPTION = "The libndp-devel package contains the header files necessary for developing \
programs using libndp."
LICENSE = "LGPL-2.1-or-later"

PV = "1.8"

RPM_NAME = "libndp-devel-1.8-1.6.aarch64.rpm"
RPM_HASH = "7f763dfd54a5f6865b480aa92254007445d361e2301f12efde5b180b8c2432b55b90c76e92e41a171b9901cb802551e585f72c938ae36be9dd357f310b7acfd3"

RPROVIDES:${PN} += "libndp-devel libndp-devel(aarch-64) pkgconfig(libndp)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libndp0"

inherit rpm
