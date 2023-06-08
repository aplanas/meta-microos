SUMMARY = "Documentation for texlive-cases"
DESCRIPTION = "This package includes the documentation for texlive-cases"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2svn54682"

RPM_NAME = "texlive-cases-doc-2023.201.3.2svn54682-52.1.noarch.rpm"
RPM_HASH = "60e380a962c9e32dcf55efed5ce6d800a303fc6584055f2d6d2b5904e40380232e98fc7cdbfbdbde68b3e0ad728a1c897392bdf62c8fdc77e12744d28d1cbbbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cases-doc"
RDEPENDS:${PN} += ""

inherit rpm
