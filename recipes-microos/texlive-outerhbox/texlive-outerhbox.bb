SUMMARY = "Collect horizontal material for contributing to a paragraph"
DESCRIPTION = "The package provides the \\outerhbox command, which is similar \
to \\hbox, except that material is set in outer horizontal mode. \
This prevents TeX from optimising away maths penalties and the \
like, that are needed when the material is \\unhbox'ed."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.2svn54254"

RPM_NAME = "texlive-outerhbox-2023.201.1.2svn54254-54.1.noarch.rpm"
RPM_HASH = "db0104da4fcea2d660df355c06e17a9ac03e5d72e152ef44ed0f3e3e5a36dc26800972a83f246a011fc282568bfe7e554da75cf7b209062d67915d2a60ac359b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(outerhbox.sty) texlive-outerhbox"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
