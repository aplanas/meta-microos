SUMMARY = "A package for creating tramlines (lines above and below a title used by lawyers in the UK)"
DESCRIPTION = "This package automatically creates tramlines (lines above and \
below a title used by lawyers in the UK and the Commonwealth)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0svn65692"

RPM_NAME = "texlive-tramlines-2023.201.1.1.0svn65692-52.1.noarch.rpm"
RPM_HASH = "6293f15d64041ab3387324314a70e02305880f2a2b5dff0729bfba8b15cabdb307e092e97d8e68b10e13ae430e98b2935ad129b076ad12b44966ba075e14a145"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tramlines.sty) texlive-tramlines"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(booktabs.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
