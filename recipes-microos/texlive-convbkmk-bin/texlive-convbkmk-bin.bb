SUMMARY = "Binary files of convbkmk"
DESCRIPTION = "Binary files of convbkmk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn30408"

RPM_NAME = "texlive-convbkmk-bin-2023.20230311.svn30408-89.1.aarch64.rpm"
RPM_HASH = "d7a5bedd78a886e9000ed239b90953432e1983367844d4f923df00ed208dba1b4af32fe5457bc18f5d876490715e67e074aa86d407bd28a14959fb3d5ba772d1"

RPROVIDES:${PN} += "texlive-convbkmk-bin texlive-convbkmk-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-convbkmk"

inherit rpm
