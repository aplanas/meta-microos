SUMMARY = "Create scalebars for maps, diagrams or photos"
DESCRIPTION = "This is a small package to create scalebars for maps, diagrams \
or photos. It was designed for use with cave maps but can be \
used for anything from showing a scalebar in kilometres for \
topographic maps to a scalebar in micrometres for an electron \
microscope image."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-scalebar-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "5dadd7e425dbeea210b04d6d6f6d79a4a40917cff9db232afd09b28a185471a64a745be6c63d78a2d648704009cafeefc0e19c7c24c5dd92554319ffe0a6c53a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(scalebar.sty) texlive-scalebar"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(calc.sty) tex(fp.sty) tex(ifthen.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
