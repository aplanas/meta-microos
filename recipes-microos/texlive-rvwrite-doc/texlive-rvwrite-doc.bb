SUMMARY = "Documentation for texlive-rvwrite"
DESCRIPTION = "This package includes the documentation for texlive-rvwrite"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn19614"

RPM_NAME = "texlive-rvwrite-doc-2023.201.1.2svn19614-53.1.noarch.rpm"
RPM_HASH = "5a4dcee29637f6610449f184a4777a4995415107cebd85535c9bd9a573d110133ef1b31ec7b8d2eb736b4c163bbb445574f7886c40fcc293a9298b919a814db0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rvwrite-doc"
RDEPENDS:${PN} += ""

inherit rpm
