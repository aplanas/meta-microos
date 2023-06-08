SUMMARY = "Typeset articles for the Annals of Mathematics"
DESCRIPTION = "The package provides a class for typesetting articles for The \
Annals of Mathematics."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.27svn63442"

RPM_NAME = "texlive-aomart-2023.201.1.27svn63442-54.1.noarch.rpm"
RPM_HASH = "9ba52ab7bb6a835935a23ed4d9bb1a9ac77ea8f92c5bb1e6cca8b794236911f7b8e732b7479d6d143e616f9c63b7bf8d0ef7b977c7b9a7bd4ce7d813ccaf503b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(aomart.cls) texlive-aomart"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsart.cls) tex(cmtiup.sty) tex(environ.sty) tex(fancyhdr.sty) tex(hyperref.sty) tex(ifpdf.sty) tex(lastpage.sty) tex(yhmath.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
