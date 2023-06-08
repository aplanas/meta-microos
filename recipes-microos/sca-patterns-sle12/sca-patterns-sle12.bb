SUMMARY = "Supportconfig Analysis Patterns for SLE12"
DESCRIPTION = "Supportconfig Analysis (SCA) appliance patterns to identify known \
issues relating to all versions of SLE12 \
 \
See /usr/share/doc/packages/sca-patterns-base/COPYING.GPLv2"
LICENSE = "GPL-2.0-only"

PV = "1.5.3"

RPM_NAME = "sca-patterns-sle12-1.5.3-1.2.noarch.rpm"
RPM_HASH = "b826d336a539bbf7374b66082f40b53f4446d7353d6ac43c018e3bb622023d99c5478d99de16a30ee9d1154d5594162708f58e1284d9a2bb3373f794428d465f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sca-patterns-sle12"
RDEPENDS:${PN} += "/usr/bin/perl /usr/bin/python3 sca-patterns-base"

inherit rpm
