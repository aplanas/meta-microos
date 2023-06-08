SUMMARY = "Stamp letters with >>Deutsche Post<<'s service >>Internetmarke<<"
DESCRIPTION = "The postage package is used for franking letters with \
>>Deutsche Post<<'s online postage service >>Internetmarke<<. \
Note that in order to print valid stamps you must point to a \
valid PDF of >>Deutsche Post<<'s >>Ausdruck 4-spaltig (DIN \
A4)<<."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn55920"

RPM_NAME = "texlive-postage-2023.201.1.0svn55920-52.1.noarch.rpm"
RPM_HASH = "6acbaca8a4991c15e1b80c500d00264f640fa8acdf94c93a3139047803b21879998b6a9eaea06a29cf5a67531907e2a9cc9e57ec87a00ddc560625a698034210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(postage.sty) texlive-postage"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(calc.sty) tex(graphicx.sty) tex(keyval.sty) tex(tikz.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
