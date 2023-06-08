SUMMARY = "A package to typeset quotations easier"
DESCRIPTION = "The package provides a macro to typeset quotations, using the \
command \\say{stuff}. The quotation mark glyphs are inserted by \
the macro; nested quotations are detected."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn20520"

RPM_NAME = "texlive-dirtytalk-2023.201.1.0svn20520-52.1.noarch.rpm"
RPM_HASH = "0b9516926d2345577e4d8d0f41abc031a85db7765eb6cc81d751d76cc20b6d46666defd72cc079002846645cc1868f394ff0323fa92ad9054e86e0a896e3b676"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dirtytalk.sty) texlive-dirtytalk"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(ifthen.sty) tex(kvoptions.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
