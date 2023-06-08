SUMMARY = "Italian documentation and tutorials for KiCad"
DESCRIPTION = "This package contains Italian documentation and tutorials for KiCad"
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-or-later"

PV = "7.0.2"

RPM_NAME = "kicad-doc-it-7.0.2-1.1.noarch.rpm"
RPM_HASH = "e7ec1a481e53212cac31a609fe086f59855a696eb33d5c873fb067a31fda6eafb6e77580368c4124fc0580e2cde559539a3c02b343d567f931d26682653f4245"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kicad-doc-it locale(kicad-doc:it)"
RDEPENDS:${PN} += "kicad-doc-en"

inherit rpm
