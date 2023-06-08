SUMMARY = "Documentation for texlive-charissil"
DESCRIPTION = "This package includes the documentation for texlive-charissil"
LICENSE = "OFL-1.1"

PV = "2023.201.6.101svn64998"

RPM_NAME = "texlive-charissil-doc-2023.201.6.101svn64998-53.1.noarch.rpm"
RPM_HASH = "0e74be3c5a50fe535f5155f30d01a716ad406eff6caeb69a64c939ed16f7a92dfb8127cbab1ba26ecf8d71a0c592ce0f079448a013ac24897ae6bb9ff3061e0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-charissil-doc"
RDEPENDS:${PN} += ""

inherit rpm
