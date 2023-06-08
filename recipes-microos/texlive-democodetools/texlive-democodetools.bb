SUMMARY = "Package for LaTeX code documentation"
DESCRIPTION = "This is 'yet another doc/docx/doc3' package for LaTeX code \
documentation."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1betasvn64314"

RPM_NAME = "texlive-democodetools-2023.201.1.0.1betasvn64314-52.1.noarch.rpm"
RPM_HASH = "b3534dd7abfb01ef270ea76711b23b7da4d4342559ad730aa10525d929068cfd0aaf21c45cb64c1e2b3c66a94975ea0b2adce4ee93d938ff693cfdf38875f975"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(democodelisting.sty) tex(democodetools.sty) texlive-democodetools"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(listings.sty) tex(scontents.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
