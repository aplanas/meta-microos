SUMMARY = "Binary files of texdoctk"
DESCRIPTION = "Binary files of texdoctk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29741"

RPM_NAME = "texlive-texdoctk-bin-2023.20230311.svn29741-89.1.aarch64.rpm"
RPM_HASH = "b5bbbd05821e5ab6a60f2f7c6a4d7f6c49301aba73788161b039c2957e2e04d2995296f480ff4c092243e2f21619ab8fa3ecd5775c9a7c0c3167a25e8abb34ce"

RPROVIDES:${PN} += "texlive-texdoctk-bin texlive-texdoctk-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-texdoctk"

inherit rpm
