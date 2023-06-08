SUMMARY = "Development files for libreofficekit"
DESCRIPTION = "The libreofficekit-devel package contains libraries and header files for \
developing applications that use libreofficekit."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreofficekit-devel-7.5.3.1-1.1.aarch64.rpm"
RPM_HASH = "983c830e23d3e82d4b0fddb8f76cc05a47a8d374cd042daffd3034c598b275b7eae6efcec18a0babb500d03c9388ed178bba7e7ff26792e92b917057c3918dd0"

RPROVIDES:${PN} += "libreofficekit-devel libreofficekit-devel(aarch-64)"
RDEPENDS:${PN} += "libreofficekit"

inherit rpm
