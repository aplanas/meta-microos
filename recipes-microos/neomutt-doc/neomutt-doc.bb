SUMMARY = "Additional documentation for neomutt"
DESCRIPTION = "Documentation for NeoMutt with neomuttrc examples for different environments \
and requirements."
LICENSE = "GPL-2.0-or-later"

PV = "20230407"

RPM_NAME = "neomutt-doc-20230407-1.1.noarch.rpm"
RPM_HASH = "c21397349a45a2f3957dd8e60aac5f539b03affc385f2eccb48b542a82bfefc76cda73aa0bf3fee3681991049fd52735f2db4c321e9391f572621709c7aee3b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "neomutt-doc"
RDEPENDS:${PN} += "neomutt"

inherit rpm
