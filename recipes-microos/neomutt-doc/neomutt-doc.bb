SUMMARY = "Additional documentation for neomutt"
DESCRIPTION = "Documentation for NeoMutt with neomuttrc examples for different environments \
and requirements."
LICENSE = "GPL-2.0-or-later"

PV = "20230517"

RPM_NAME = "neomutt-doc-20230517-1.1.noarch.rpm"
RPM_HASH = "5cec1d9b48b4610e90859e8f7ae2d2121f6b4e4a115805b37590540e33c4328c9399331fcfa64026b7e1a2f6d73373938c089cea98e36b68832c3fe6c5e82edb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "neomutt-doc"
RDEPENDS:${PN} += "neomutt"

inherit rpm
