SUMMARY = "Header files for the a52dec library"
DESCRIPTION = "Header files and static library for the a52dec library. \
Install this package if you want to compile programs using the library."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.5+svn613"

RPM_NAME = "liba52-devel-0.7.5+svn613-3.16.aarch64.rpm"
RPM_HASH = "b9df56185ed2a9f630409529974bd981c6e72612da2319b6fbe929f25110ab8b17a29a7043ddad39a685c8ce37b34ccb93de19870645f297dd7ec53959881337"

RPROVIDES:${PN} += "a52dec-devel \
liba52-devel \
liba52-devel(aarch-64) \
liba52dec-devel \
pkgconfig(liba52)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
liba52-0"

inherit rpm
