SUMMARY = "Documentation for texlive-dtxgen"
DESCRIPTION = "This package includes the documentation for texlive-dtxgen"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.08svn51663"

RPM_NAME = "texlive-dtxgen-doc-2023.201.1.08svn51663-52.1.noarch.rpm"
RPM_HASH = "84a42b7a34203b0e4eae8c62bd4fe41589e8ec9eb76e5261c0a413474997b00406e1f8d23d0037178c5e4afa11b84582112623124eef167f6fc04befe92c3bab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dtxgen-doc"
RDEPENDS:${PN} += ""

inherit rpm
