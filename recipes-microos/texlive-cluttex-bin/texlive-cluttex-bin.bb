SUMMARY = "Binary files of cluttex"
DESCRIPTION = "Binary files of cluttex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn48871"

RPM_NAME = "texlive-cluttex-bin-2023.20230311.svn48871-89.1.aarch64.rpm"
RPM_HASH = "516c3e77ad6ad5ac944e818b9b96b04d8e4fbb3d3e95c53cbdc630e6a3ae58f659494ad01a199c307a7904127048e18f00bb90658122a5fad8f1e015a7eae09c"

RPROVIDES:${PN} += "texlive-cluttex-bin texlive-cluttex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-cluttex"

inherit rpm
