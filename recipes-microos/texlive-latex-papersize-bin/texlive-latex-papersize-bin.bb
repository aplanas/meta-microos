SUMMARY = "Binary files of latex-papersize"
DESCRIPTION = "Binary files of latex-papersize"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn42296"

RPM_NAME = "texlive-latex-papersize-bin-2023.20230311.svn42296-89.1.aarch64.rpm"
RPM_HASH = "e2c69815335d8d929e9e8731426aba8bde39d068ff65db7071077052e3824cbdbfd1cbeecec9958a4aaffd8ae242651270ba10f4481151f18f69610c7530d82e"

RPROVIDES:${PN} += "texlive-latex-papersize-bin texlive-latex-papersize-bin(aarch-64)"
RDEPENDS:${PN} += "texlive-latex-papersize"

inherit rpm
