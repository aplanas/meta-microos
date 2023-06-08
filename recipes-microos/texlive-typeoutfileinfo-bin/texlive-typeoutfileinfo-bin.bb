SUMMARY = "Binary files of typeoutfileinfo"
DESCRIPTION = "Binary files of typeoutfileinfo"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25648"

RPM_NAME = "texlive-typeoutfileinfo-bin-2023.20230311.svn25648-89.1.aarch64.rpm"
RPM_HASH = "c3b167967c4bd9507f679be253a28a4cb30c71196d84bf12a8ec6931ef94851370fa06cefc2f8363961e22d3e1f43331a0cc3900de8778c8206867f1f823b9d2"

RPROVIDES:${PN} += "texlive-typeoutfileinfo-bin texlive-typeoutfileinfo-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-typeoutfileinfo"

inherit rpm
