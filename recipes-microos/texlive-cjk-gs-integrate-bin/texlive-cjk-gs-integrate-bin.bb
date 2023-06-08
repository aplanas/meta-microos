SUMMARY = "Binary files of cjk-gs-integrate"
DESCRIPTION = "Binary files of cjk-gs-integrate"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37223"

RPM_NAME = "texlive-cjk-gs-integrate-bin-2023.20230311.svn37223-89.1.aarch64.rpm"
RPM_HASH = "078b52aea588364935a69d12e1ac5ae1db3c0eccd4b267954355ee7a2c8c562c3e8316561f0e0a2502ab3b9161e772715d2854184ae9a1dff7500b0decbd5069"

RPROVIDES:${PN} += "texlive-cjk-gs-integrate-bin texlive-cjk-gs-integrate-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-cjk-gs-integrate"

inherit rpm
