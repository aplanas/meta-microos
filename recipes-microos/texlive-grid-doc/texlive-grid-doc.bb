SUMMARY = "Documentation for texlive-grid"
DESCRIPTION = "This package includes the documentation for texlive-grid"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn61719"

RPM_NAME = "texlive-grid-doc-2023.201.1.0svn61719-53.1.noarch.rpm"
RPM_HASH = "98a573dab80a290d4f77c0a990bad961f9097c32fa7459c0c0a08177aac49ec0b5627c5db6fa509929d49c1b796500acda309cc61c2b768e8227390908a4575f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grid-doc"
RDEPENDS:${PN} += ""

inherit rpm
