SUMMARY = "General package for loading maths alphabets in LaTeX"
DESCRIPTION = "Package mathalfa was renamed to mathalpha. For backward \
compatibility the old name will continue to be recognized in \
LaTeX documents. The package provides means of loading maths \
alphabets (such as are normally addressed via macros \\mathcal, \
\\mathbb, \\mathfrak and \\mathscr), offering various features \
normally missing in existing packages for this job."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.143svn61089"

RPM_NAME = "texlive-mathalpha-2023.201.1.143svn61089-52.1.noarch.rpm"
RPM_HASH = "122f15a3e4064cf2baa350f3e02e57edd469ca1a1e990750d2b13fb715afc1d712a122b96156b337cd94646280132c05fed54cb78afe66ef461b9d68a2e40d7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(mathalfa.sty) tex(mathalpha.sty) texlive-mathalpha"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(bboldx.sty) tex(dsserif.sty) tex(tx-ds.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
