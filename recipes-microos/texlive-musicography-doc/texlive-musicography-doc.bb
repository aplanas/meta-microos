SUMMARY = "Documentation for texlive-musicography"
DESCRIPTION = "This package includes the documentation for texlive-musicography"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn66115"

RPM_NAME = "texlive-musicography-doc-2023.201.svn66115-54.1.noarch.rpm"
RPM_HASH = "66651ca6c1f95a9f55f01c0af59d93a78c598d0b494297b7c585a0c5c4384ef691d666e2f39ef8e25f67dfc5d454d55f2c940c317622bdf0ae7ef0bf1617a8d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-musicography-doc"
RDEPENDS:${PN} += ""

inherit rpm
