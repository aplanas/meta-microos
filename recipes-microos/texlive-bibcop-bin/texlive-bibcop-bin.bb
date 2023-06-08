SUMMARY = "Binary files of bibcop"
DESCRIPTION = "Binary files of bibcop"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn65257"

RPM_NAME = "texlive-bibcop-bin-2023.20230311.svn65257-89.1.aarch64.rpm"
RPM_HASH = "5386e187b7f2fb28c028bf7ceb3ce4b11a5462aee58c03d22286da41cfcecd635c8b4f8520cce03334af4f78abdaa66ae2bb1bd31e564ca7b48a10788c81c956"

RPROVIDES:${PN} += "texlive-bibcop-bin texlive-bibcop-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-bibcop"

inherit rpm
