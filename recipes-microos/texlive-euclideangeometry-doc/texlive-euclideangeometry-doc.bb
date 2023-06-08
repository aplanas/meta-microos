SUMMARY = "Documentation for texlive-euclideangeometry"
DESCRIPTION = "This package includes the documentation for texlive-euclideangeometry"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.1svn60697"

RPM_NAME = "texlive-euclideangeometry-doc-2023.201.0.0.2.1svn60697-52.1.noarch.rpm"
RPM_HASH = "a140302fe89727f2b2bddff50260ed5bac746e3d19507c1099e245fdbad3684854d4e63e7b1386b7a71ebe04fcc61e16ce1d839f654bd8ef9748186e92210039"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-euclideangeometry-doc"
RDEPENDS:${PN} += ""

inherit rpm
