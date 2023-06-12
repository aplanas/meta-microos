SUMMARY = "Development files for libreofficekit"
DESCRIPTION = "The libreofficekit-devel package contains libraries and header files for \
developing applications that use libreofficekit."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreofficekit-devel-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "6733be6e47796ae4c2907abcb37b734b2f195e97a32b2a8032bf67c64859c94745f2d5c8d26072404eedc438bcc90cdce2068df36abf65d0b2270399e2f3b820"

RPROVIDES:${PN} += "libreofficekit-devel libreofficekit-devel(aarch-64)"
RDEPENDS:${PN} += "libreofficekit"

inherit rpm
