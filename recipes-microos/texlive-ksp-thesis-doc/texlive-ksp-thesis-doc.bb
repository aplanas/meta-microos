SUMMARY = "Documentation for texlive-ksp-thesis"
DESCRIPTION = "This package includes the documentation for texlive-ksp-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn39080"

RPM_NAME = "texlive-ksp-thesis-doc-2023.201.1.0.2svn39080-55.1.noarch.rpm"
RPM_HASH = "866a5aafb9cedeeff587efa7712c19401d414cad6230e6b2a818042a5715cf13381a5feb8c1b67f7caf72851fcf30c8f7227f6d51cd05dc03e04125196715be6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ksp-thesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
