SUMMARY = "Documentation files for the gnome-builder package"
DESCRIPTION = "Builder is an IDE for GNOME and a tool to help writing GNOME-based \
applications."
LICENSE = "CC-BY-SA-3.0 & GPL-2.0-or-later & GPL-3.0-or-later & LGPL-3.0-or-later & LGPL-2.1-or-later"

PV = "44.1"

RPM_NAME = "gnome-builder-doc-44.1-1.2.noarch.rpm"
RPM_HASH = "941beb728edca9184838f32b04b0ba65171cc4300d19373bdd1ef7beba6079cc845cfee9b3cb5bff76ee7ceceabb58fe3bc40427dd57e5c23cc68869e103cdb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-builder-doc"
RDEPENDS:${PN} += "gnome-builder"

inherit rpm
