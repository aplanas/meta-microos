SUMMARY = "Rewrite labels in EPS graphics"
DESCRIPTION = "A macro package for use with epsf.tex which allows PostScript \
labels in an Encapsulated PostScript file to be replaced by TeX \
labels. The package provides commands \\relabel (simply replace \
a PostScript string), \\adjustrelabel (replace a PostScript \
string, with position adjustment), and \\extralabel (add a label \
at given coordinates). You can, if you so choose, use the \
facilities of the labelfig package in place of using \
\\extralabel."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn19082"

RPM_NAME = "texlive-rlepsf-2023.201.svn19082-53.1.noarch.rpm"
RPM_HASH = "76b7fa7114b70bcdf980c633ff382f4111746f55f27e4fadf92dd313f753dbd51e5d1341db82898de79c100037c27b60f9599147a34f5b269ba92521c065c679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(rlepsf.tex) texlive-rlepsf"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
