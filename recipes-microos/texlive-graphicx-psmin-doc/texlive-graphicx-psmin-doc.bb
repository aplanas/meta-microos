SUMMARY = "Documentation for texlive-graphicx-psmin"
DESCRIPTION = "This package includes the documentation for texlive-graphicx-psmin"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn56931"

RPM_NAME = "texlive-graphicx-psmin-doc-2023.201.1.2svn56931-53.1.noarch.rpm"
RPM_HASH = "78ee7696b6f2568fb51a12d4d12599589236017faec390e08c505c131ef84e34a487cc8ff9b12f1bcd2bf097b0c7cc0b8def9854c2fd18af915aebca9f917b32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphicx-psmin-doc"
RDEPENDS:${PN} += ""

inherit rpm
