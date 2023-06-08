SUMMARY = "Documentation for texlive-mafr"
DESCRIPTION = "This package includes the documentation for texlive-mafr"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-mafr-doc-2023.201.1.0svn15878-52.1.noarch.rpm"
RPM_HASH = "68b2bd9414e285c5f2f8bc0aa8edf01380b5ab429a5aecc0127b588e86c12586246b68cc1e6747992bbc674ba9c6c4cb42ac183cb3bf1fbda6d78814ff05d21a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-mafr-doc:fr;en) texlive-mafr-doc"
RDEPENDS:${PN} += ""

inherit rpm
