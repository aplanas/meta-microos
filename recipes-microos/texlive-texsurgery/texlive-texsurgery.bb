SUMMARY = "A LaTeX companion to the 'texsurgery' python project"
DESCRIPTION = "This LaTeX library is a companion to the texsurgery python \
project. It will make sure that 'pdflatex document.tex' will \
work, with reasonable defaults, for a document that is intended \
to work with texsurgery, and also has other uses, always in \
tandem with the texsurgery pypi package."
LICENSE = "BSD-3-Clause"

PV = "2023.201.0.0.6.0svn59885"

RPM_NAME = "texlive-texsurgery-2023.201.0.0.6.0svn59885-54.1.noarch.rpm"
RPM_HASH = "6c9d2abf71b77e1e2b1c1b35386b157fda845820d00ddac41ad146c1fe91ce8d19e60316309fab0049bca90addef4f04b4ed3fcff33a0209a5487172fe59e2d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(texsurgery.sty) texlive-texsurgery"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(environ.sty) tex(hyperref.sty) tex(listings.sty) tex(verbatim.sty) tex(xcolor.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
