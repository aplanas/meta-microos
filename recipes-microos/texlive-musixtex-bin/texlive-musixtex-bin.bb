SUMMARY = "Binary files of musixtex"
DESCRIPTION = "Binary files of musixtex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37026"

RPM_NAME = "texlive-musixtex-bin-2023.20230311.svn37026-89.1.aarch64.rpm"
RPM_HASH = "51d2ad90a400ce8052abba5ba55b4bb9c2549eb067ed752c0fd7dd40e11819ab5ae825f5932d98bde2b8f5fae7a90a368467340ea65d39e842f2441aef165923"

RPROVIDES:${PN} += "texlive-musixtex-bin texlive-musixtex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-m-tx-bin texlive-musixtex texlive-pmx-bin"

inherit rpm
