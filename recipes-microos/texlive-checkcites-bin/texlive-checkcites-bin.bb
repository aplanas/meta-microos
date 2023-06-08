SUMMARY = "Binary files of checkcites"
DESCRIPTION = "Binary files of checkcites"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn25623"

RPM_NAME = "texlive-checkcites-bin-2023.20230311.svn25623-89.1.aarch64.rpm"
RPM_HASH = "ebe249d992d7505ee0195b749cb692375c754aaf298f2828c3ecaef2491dbe494b001bfc8d117033830f038496467f88d4cd1c7d02f02618244065672ffc656e"

RPROVIDES:${PN} += "texlive-checkcites-bin texlive-checkcites-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-checkcites"

inherit rpm
