SUMMARY = "Documentation for texlive-coffeestains"
DESCRIPTION = "This package includes the documentation for texlive-coffeestains"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.5.1svn59703"

RPM_NAME = "texlive-coffeestains-doc-2023.201.0.0.5.1svn59703-53.1.noarch.rpm"
RPM_HASH = "b6fea6a42b1f4e801bf6e69b76d93060364f2823e4653826e07faa018e12eb5fda872bc1685ec293527ee035b5895a25de6fd3c1e2d0dc2aadf1d8128f44e398"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-coffeestains-doc:fr) \
texlive-coffeestains-doc"
RDEPENDS:${PN} += ""

inherit rpm
