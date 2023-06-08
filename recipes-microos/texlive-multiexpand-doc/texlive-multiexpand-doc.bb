SUMMARY = "Documentation for texlive-multiexpand"
DESCRIPTION = "This package includes the documentation for texlive-multiexpand"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn45943"

RPM_NAME = "texlive-multiexpand-doc-2023.201.1.5svn45943-54.1.noarch.rpm"
RPM_HASH = "d1fa6a8c086ca7227f6fd36fcbefba197f1f2e9c47d9038c88dbf02bd250b73afc5f82b10931b1f647005e4f584b187c8c88c4a7646d07e12367efda98d4a520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multiexpand-doc"
RDEPENDS:${PN} += ""

inherit rpm
