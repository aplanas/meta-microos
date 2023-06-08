SUMMARY = "Documentation for texlive-varsfromjobname"
DESCRIPTION = "This package includes the documentation for texlive-varsfromjobname"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn44154"

RPM_NAME = "texlive-varsfromjobname-doc-2023.201.1.0svn44154-53.1.noarch.rpm"
RPM_HASH = "612400c6bc30211c7872c52311714afc79b5ff5985f602790c987a6a2cf70335158ba0640629dea93494c3f004a11ae06a727eb9b0478e3f5a6e56a337f26439"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-varsfromjobname-doc"
RDEPENDS:${PN} += ""

inherit rpm
