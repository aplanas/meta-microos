SUMMARY = "Documentation for texlive-facture"
DESCRIPTION = "This package includes the documentation for texlive-facture"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2.2svn43865"

RPM_NAME = "texlive-facture-doc-2023.201.1.2.2svn43865-52.1.noarch.rpm"
RPM_HASH = "261d127122fd22120a3ef7e9148a0d2d08c67b237af39e3c350de9884df8d55b574e36bbe9830b32ee447870279d0ce40f5cec02d6daaa8868f6260a102c804f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-facture-doc:fr) \
texlive-facture-doc"
RDEPENDS:${PN} += ""

inherit rpm
