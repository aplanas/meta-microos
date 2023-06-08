SUMMARY = "Documentation for texlive-ltb2bib"
DESCRIPTION = "This package includes the documentation for texlive-ltb2bib"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn43746"

RPM_NAME = "texlive-ltb2bib-doc-2023.201.0.0.01svn43746-52.1.noarch.rpm"
RPM_HASH = "06a93a5ec8eca43a723230b7219354c4b2fce30e60ccc55b1422a96fdbf219bce4f2a4ca0afbc9ecb04dfe3ceee71669229767a5faf86f168f8ebad603a1d852"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltb2bib-doc"
RDEPENDS:${PN} += ""

inherit rpm
