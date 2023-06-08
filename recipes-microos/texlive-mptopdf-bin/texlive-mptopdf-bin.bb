SUMMARY = "Binary files of mptopdf"
DESCRIPTION = "Binary files of mptopdf"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn18674"

RPM_NAME = "texlive-mptopdf-bin-2023.20230311.svn18674-89.1.aarch64.rpm"
RPM_HASH = "6080aa9e585e934823667da88e0d9cf0dae6a0b1c20bf4fb05b5bd5b3a0feeb96b9a45973f35a46e13ed3d6e9dfacea22ca187cae2903c6689c22976b1249936"

RPROVIDES:${PN} += "texlive-mptopdf-bin texlive-mptopdf-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-mptopdf"

inherit rpm
