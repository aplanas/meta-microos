SUMMARY = "Documentation for texlive-minim-mp"
DESCRIPTION = "This package includes the documentation for texlive-minim-mp"
LICENSE = "LPPL-1.0"

PV = "2023.201.2023_1.2svn66395"

RPM_NAME = "texlive-minim-mp-doc-2023.201.2023_1.2svn66395-54.1.noarch.rpm"
RPM_HASH = "08d5f45da80b179ea7575f6ffa774c76725eb837e8522c073396a11df020a9e085bc59be3af5a7e6807dbcedd365566bddcbaf2b05a675d7f6baf4042910e6d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minim-mp-doc"
RDEPENDS:${PN} += ""

inherit rpm
