SUMMARY = "Binary files of diadia"
DESCRIPTION = "Binary files of diadia"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37645"

RPM_NAME = "texlive-diadia-bin-2023.20230311.svn37645-89.1.noarch.rpm"
RPM_HASH = "cc9baadf315591bb279ccc5d69237d56879eb822dd2a69300c3661cf224efa7ea33c523bc8dda6a26323848b8586d1936329cdafde4c39a45959aaaeaea60515"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-diadia-bin"
RDEPENDS:${PN} += "texlive-diadia"

inherit rpm
