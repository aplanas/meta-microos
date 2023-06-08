SUMMARY = "Documentation for texlive-hopatch"
DESCRIPTION = "This package includes the documentation for texlive-hopatch"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn65491"

RPM_NAME = "texlive-hopatch-doc-2023.201.1.5svn65491-53.1.noarch.rpm"
RPM_HASH = "50eb6dbefcd67894638a9753a299f46043da4a0e69c5af1c95faca5991dfc5b390fc394a3922ff4a8f91855bdeb7c8b649f9a9b8517efafd223411e4187b00e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hopatch-doc"
RDEPENDS:${PN} += ""

inherit rpm
