SUMMARY = "Binary files of pdfbook2"
DESCRIPTION = "Binary files of pdfbook2"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn37537"

RPM_NAME = "texlive-pdfbook2-bin-2023.20230311.svn37537-91.1.aarch64.rpm"
RPM_HASH = "b208e04b5eea1a55cb3d32a1fbe4da22fd98c61d281d155a16919a73a12100def374177dbee6e42d1a571d9c764255258abb496f92cbe6f4731709af5246f00d"

RPROVIDES:${PN} += "texlive-pdfbook2-bin texlive-pdfbook2-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pdfbook2"

inherit rpm
