SUMMARY = "Conversion of punctuation in maths mode"
DESCRIPTION = "The package modifies the behaviour of characters in maths mode \
so that: '.' is used as a one-thousand separator (as is common \
in Germany) ',' is used as a decimal separator (as is common in \
Germany) '--' is represented with spacing as appropriate to \
such constructs as '1.000,--'. These conversions may be \
switched on and off."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn32279"

RPM_NAME = "texlive-ziffer-2023.201.2.1svn32279-52.1.noarch.rpm"
RPM_HASH = "4acdccb1436c2abca79d18f91f1aa014f490d2262e5656bc2e049a1a8b6a6d0d824d8070ee0eb8d8fc87efb2cd5c2a9a93316c285e8218f94bf89ad98ef5cc2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ziffer.sty) texlive-ziffer"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
