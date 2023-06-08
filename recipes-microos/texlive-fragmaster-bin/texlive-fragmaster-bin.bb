SUMMARY = "Binary files of fragmaster"
DESCRIPTION = "Binary files of fragmaster"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn13663"

RPM_NAME = "texlive-fragmaster-bin-2023.20230311.svn13663-89.1.aarch64.rpm"
RPM_HASH = "a6a0625212668b9f31d4012b41b15201d7274b4b051e208ef3ede75a60e4657d899c70fd5a6acab8ca9620b06c5dfd3e47e8282f29a30ec06cf7d20f9f545048"

RPROVIDES:${PN} += "texlive-fragmaster-bin texlive-fragmaster-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-fragmaster"

inherit rpm
