SUMMARY = "Binary files of match_parens"
DESCRIPTION = "Binary files of match_parens"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn23500"

RPM_NAME = "texlive-match_parens-bin-2023.20230311.svn23500-89.1.aarch64.rpm"
RPM_HASH = "050d2d05f8038f78c6a378d7961097fd0abee3cf5fd740b0dbcfeec67822926e04c976920b2d91b7dc7e43242bf0d5e6f1c1dffa16172e54f673857c85d2b411"

RPROVIDES:${PN} += "texlive-match_parens-bin texlive-match_parens-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-match_parens"

inherit rpm
