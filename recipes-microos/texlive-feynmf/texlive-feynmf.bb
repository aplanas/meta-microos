SUMMARY = "Macros and fonts for creating Feynman (and other) diagrams"
DESCRIPTION = "The feynmf package provides an interface to Metafont (inspired \
by the facilities of mfpic) to use simple structure \
specifications to produce relatively complex diagrams. (The \
feynmp package, also part of this bundle, uses MetaPost in the \
same way.) While the package was designed for Feynman diagrams, \
it could in principle be used for diagrams in graph and similar \
theories, where the structure is semi-algorithmically \
determined."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.08svn17259"

RPM_NAME = "texlive-feynmf-2023.201.1.08svn17259-52.1.noarch.rpm"
RPM_HASH = "642b541a4e9d614cd7f4567ef756c7b796b76f13e602d1f006943cd58c962efbf92e0913d8e5f3a86d797c07ec3772f4788cc6379782639e812fc75b4098f891"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(feynmf.sty) tex(feynmp.sty) texlive-feynmf"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(graphics.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
