SUMMARY = "Automatic line breaking of displayed equations"
DESCRIPTION = "The package provides solutions to a number of common \
difficulties in writing displayed equations and getting \
high-quality output. For example, it is a well-known \
inconvenience that if an equation must be broken into more than \
one line, 'left...right' constructs cannot span lines. The \
breqn package makes them work as one would expect whether or \
not there is an intervening line break. The single most \
ambitious goal of the package, however, is to support automatic \
linebreaking of displayed equations. Such linebreaking cannot \
be done without substantial changes under the hood in the way \
formulae are processed; the code must be watched carefully, \
keeping an eye on possible glitches. The bundle also contains \
the flexisym and mathstyle packages, which are both designated \
as support for breqn."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.98lsvn60881"

RPM_NAME = "texlive-breqn-2023.201.0.0.98lsvn60881-52.1.noarch.rpm"
RPM_HASH = "6ed8074942e930870074e7d35fd64407dba6376383ba3892d68db84b2797f5380f9cc98277b718304c86cb458997441f2a5d31b8d4dc77cb8a9d7b4cd9c156f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(breqn.sty) tex(flexisym.sty) tex(mathstyle.sty) texlive-breqn"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(calc.sty) tex(expl3.sty) tex(graphicx.sty) tex(keyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
