SUMMARY = "Floating algorithm environment with algorithmic keywords"
DESCRIPTION = "Algorithm2e is an environment for writing algorithms. An \
algorithm becomes a floating object (like figure, table, etc.). \
The package provides macros that allow you to create different \
keywords, and a set of predefined key words is provided; you \
can change the typography of the keywords. The package allows \
vertical lines delimiting a block of instructions in an \
algorithm, and defines different sorts of algorithms such as \
Procedure or Function; the name of these functions may be \
reused in the text or in other algorithms."
LICENSE = "LPPL-1.0"

PV = "2023.201.5.2svn44846"

RPM_NAME = "texlive-algorithm2e-2023.201.5.2svn44846-54.1.noarch.rpm"
RPM_HASH = "4f6abddfcc4049744e659f4d629986879a7ed7e5527aa0d3cac3bec1e229e20a703e03cda7ba07191795a48e7d2bf9be43578c818be8740078964a0af28cdfe7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(algorithm2e.sty) texlive-algorithm2e"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(color.sty) tex(endfloat.sty) tex(ifoddpage.sty) tex(ifthen.sty) tex(relsize.sty) tex(tocbibind.sty) tex(xspace.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
