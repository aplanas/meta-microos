SUMMARY = "Natbib citations with PDF tooltips"
DESCRIPTION = "This LaTeX package uses pdfcomment and bibentry to surround \
natbib citations with PDF tooltips."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn50449"

RPM_NAME = "texlive-xcpdftips-2023.201.1.1svn50449-52.1.noarch.rpm"
RPM_HASH = "ef0ad0fe1313eed183eae210872e2e83dc5b4be2b6ada4cf10ebced1be70dfbdc635f05d9ad1c7ff610171945f07d2e173e0c29d5416389568c1e7371fddd193"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xcpdftips.sty) texlive-xcpdftips"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(bibentry.sty) tex(calc.sty) tex(etoolbox.sty) tex(expl3.sty) tex(linegoal.sty) tex(ocgbase.sty) tex(pdfbase.sty) tex(pdfcomment.sty) tex(tcolorbox.sty) tex(xcolor.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
