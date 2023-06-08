SUMMARY = "Documentation for texlive-emf"
DESCRIPTION = "This package includes the documentation for texlive-emf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1svn42023"

RPM_NAME = "texlive-emf-doc-2023.201.1svn42023-53.1.noarch.rpm"
RPM_HASH = "c9580ded1f67a6a97ad50c058b6c78e8998252d098d0a06ec5d06994286a8768a5bc45bb663ac0e59c81ece5b7f8ecff2f6410586660cbdf96b907a5e053daf3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emf-doc"
RDEPENDS:${PN} += ""

inherit rpm
