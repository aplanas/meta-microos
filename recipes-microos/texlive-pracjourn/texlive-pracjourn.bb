SUMMARY = "Typeset articles for PracTeX"
DESCRIPTION = "The pracjourn class is used for typesetting articles in the \
PracTeX Journal. It is based on the article class with \
modifications to allow for more flexible front-matter and \
revision control, among other small changes."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.4nsvn61719"

RPM_NAME = "texlive-pracjourn-2023.201.0.0.4nsvn61719-52.1.noarch.rpm"
RPM_HASH = "a1511740d4e60fd438e07885e1c1fcb1d3e3efc62137914bb6250adf505ec4d60ce4b0a9032631eb92c2094150873f217f1f67e955387cda29ed5eaeb647ce2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pracjourn.cls) texlive-pracjourn"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(color.sty) tex(fontenc.sty) tex(graphicx.sty) tex(hyperref.sty) tex(lmodern.sty) tex(mathpazo.sty) tex(microtype.sty) tex(textcomp.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
