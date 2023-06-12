SUMMARY = "Binary files of ptex-fontmaps"
DESCRIPTION = "Binary files of ptex-fontmaps"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn44206"

RPM_NAME = "texlive-ptex-fontmaps-bin-2023.20230311.svn44206-91.1.aarch64.rpm"
RPM_HASH = "0406651e9275082b0319780fca380bba1806fff0ca825b40b5848374d0c74c12a58a14acf90cc7103a19c66baacd734ad3fc12e9403e6d92b135ab7a42d0a779"

RPROVIDES:${PN} += "texlive-ptex-fontmaps-bin \
texlive-ptex-fontmaps-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-ptex-fontmaps"

inherit rpm
