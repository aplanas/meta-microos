SUMMARY = "Documentation for texlive-lengthconvert"
DESCRIPTION = "This package includes the documentation for texlive-lengthconvert"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn55064"

RPM_NAME = "texlive-lengthconvert-doc-2023.201.1.0asvn55064-54.1.noarch.rpm"
RPM_HASH = "36ed381bbb48d6d9a4f65e92769e1475ee269ea58fa0ea509d362b5ee866dd8a47f197cb815a3b9de195c860f7964eb361af41c6fa45070b1874752a22646700"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lengthconvert-doc"
RDEPENDS:${PN} += ""

inherit rpm
