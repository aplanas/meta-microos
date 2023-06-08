SUMMARY = "Binary files of pdftex-quiet"
DESCRIPTION = "Binary files of pdftex-quiet"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn49140"

RPM_NAME = "texlive-pdftex-quiet-bin-2023.20230311.svn49140-89.1.aarch64.rpm"
RPM_HASH = "edef8fe67551d3349ae063632a195009df6cb6348fa65582168af9bb083d29e86d012597c5fb1856a2adffd93222507cb2acfbf51e5979b6fa6ce52c4c6e1f06"

RPROVIDES:${PN} += "texlive-pdftex-quiet-bin texlive-pdftex-quiet-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-pdftex-quiet"

inherit rpm
