SUMMARY = "Binary files of ptex2pdf"
DESCRIPTION = "Binary files of ptex2pdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29335"

RPM_NAME = "texlive-ptex2pdf-bin-2023.20230311.svn29335-89.1.aarch64.rpm"
RPM_HASH = "c6d905869a0c003d41715d804263720b9bbde0bc2d9fd93446ce667c432a0e0c4c2f26da3e8cb60e83d7e99c79b0bffed52e688d8d2a718911e29aff72c1dc1b"

RPROVIDES:${PN} += "texlive-ptex2pdf-bin texlive-ptex2pdf-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-ptex2pdf"

inherit rpm
