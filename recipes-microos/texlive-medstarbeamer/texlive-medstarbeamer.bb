SUMMARY = "Beamer document class for MedStar Health Research Institute"
DESCRIPTION = "This is a beamer template for MedStar Health presentations. It \
includes sample presentations using both .tex files and .rnw \
files. The document class is obviously compatible with both. \
The advantage of the .rnw file is that it can be used with \
knitr such that you can weave your R code with your \
presentation."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn38828"

RPM_NAME = "texlive-medstarbeamer-2023.201.svn38828-52.1.noarch.rpm"
RPM_HASH = "68390c0f30adac1e8180d6b8fd597167f502d2d4d4614ae22e20262ed267ae5a968467efff7f50e08584d476c72daf19fe89d8b87351f46a3e10f1fe14d2667a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(beamercolorthemeMedStarColors.sty) tex(medstarbeamer.cls) texlive-medstarbeamer"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(anysize.sty) tex(background.sty) tex(booktabs.sty) tex(cancel.sty) tex(enumerate.sty) tex(graphicx.sty) tex(hyperref.sty) tex(ifthen.sty) tex(pgf.sty) tex(soul.sty) tex(xcolor.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
