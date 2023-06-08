SUMMARY = "Adaptable BibTeX styles"
DESCRIPTION = "A family of modifications of the standard BibTeX styles whose \
behaviour may be changed by changing the user document, without \
change to the styles themselves. The package is largely used \
nowadays in its adaptation for working with Babel."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-abstyles-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "301509013049d3cd606f2ec3a7cd53ee7e9b2766f68641e65850db5ef8fe1e227444224a0411ceb93ce3363f3f6de0f77b105742fcab422e16a6c58073dfa06c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(apreambl.tex) texlive-abstyles"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
