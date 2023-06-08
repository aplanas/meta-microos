SUMMARY = "Documentation for texlive-verbments"
DESCRIPTION = "This package includes the documentation for texlive-verbments"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn23670"

RPM_NAME = "texlive-verbments-doc-2023.201.1.2svn23670-53.1.noarch.rpm"
RPM_HASH = "25aabba04ae6202919fac513c704dac74f7b6623dc37a073c30a37ed1c40f0eaff54033777d4c3b9c9a196a787a8648996ed871a55e674e646a8f141bc720587"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-verbments-doc"
RDEPENDS:${PN} += ""

inherit rpm
