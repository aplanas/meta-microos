SUMMARY = "KDE PIM Libraries: Identity Management"
DESCRIPTION = "This package provides a library to handle multiple email identities and \
associated settings."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kidentitymanagement-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "10ac2ce9373807b2fc8badbcda5542d92e36e8fa8f38eafd0aeb947c81b057b276e2d7112a963d5b4d93436606f514f6e7e82c59dace971e7298bb458f14f5bb"

RPROVIDES:${PN} += "kidentitymanagement kidentitymanagement(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
