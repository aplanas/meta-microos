SUMMARY = "Documentation for texlive-chess"
DESCRIPTION = "This package includes the documentation for texlive-chess"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.2svn20582"

RPM_NAME = "texlive-chess-doc-2023.201.1.2svn20582-53.1.noarch.rpm"
RPM_HASH = "cdc7d4119bc5ba146bc631535f37375a837a53b485a5ac52f829ee6b4dc7ab10ef34963e74e1c9e390fc76185545e8ef22b57b373796a5d78d4dd48691077b14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chess-doc"
RDEPENDS:${PN} += ""

inherit rpm
