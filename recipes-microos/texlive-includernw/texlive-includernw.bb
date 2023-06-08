SUMMARY = "Include .Rnw inside .tex"
DESCRIPTION = "This package is for including .Rnw (knitr/sweave)-files inside \
.tex-files. It requires that you have R and the R-package knitr \
installed. Note: This package will probably not work on \
Windows. It is tested only on OS X, and will probably also work \
on standard Linux distros."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.0svn47557"

RPM_NAME = "texlive-includernw-2023.201.0.0.1.0svn47557-52.1.noarch.rpm"
RPM_HASH = "7c9a8c8fdc1bf95c73509c2095ba593ca990e0d97d605bbdce0467f35cdf6855da7c1bce725ea88727d2e9b659a1ffce4406d3a81208e80127d4314ddcc8ba0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(includeRnw.sty) texlive-includernw"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(kvoptions.sty) tex(pdftexcmds.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
