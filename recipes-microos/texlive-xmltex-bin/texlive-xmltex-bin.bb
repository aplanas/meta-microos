SUMMARY = "Binary files of xmltex"
DESCRIPTION = "Binary files of xmltex"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn3006"

RPM_NAME = "texlive-xmltex-bin-2023.20230311.svn3006-89.1.aarch64.rpm"
RPM_HASH = "769d1186b2bfd69904f439c0556413dfe465f7ebb1e66f8332e24f95de2af203f535be05e7637136c32883dfe82cae6203b43229fe98d145228629dab663aca5"

RPROVIDES:${PN} += "texlive-xmltex-bin texlive-xmltex-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-xmltex"

inherit rpm
