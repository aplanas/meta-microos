SUMMARY = "Binary files of mathspic"
DESCRIPTION = "Binary files of mathspic"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23661"

RPM_NAME = "texlive-mathspic-bin-2023.20230311.svn23661-91.1.aarch64.rpm"
RPM_HASH = "00a8047c99df36477dd6ada73724f0b2f537c05649e01f3b9d9e3b5184a23f35225cf4dc79714f792dfb834156af8a59124410a1f03c9dd2e7da95ab0c4a167f"

RPROVIDES:${PN} += "texlive-mathspic-bin \
texlive-mathspic-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-mathspic"

inherit rpm
