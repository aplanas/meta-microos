SUMMARY = "Boxes that may break across pages"
DESCRIPTION = "Defines environments that allow page breaks inside framed boxes \
whose edges may be variously fancy. The bundle includes a few \
examples (shaded box, box with a wavy line on its side, etc)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn32235"

RPM_NAME = "texlive-boites-2023.201.1.1svn32235-52.1.noarch.rpm"
RPM_HASH = "f1fe95ccef5cde7f939a7160990c91540500e926529304f198cb9edeaa7f51db5e71b2a6cee2a9561fae959b2921d0f542f6c0af58a36f015e8ba84db5e78889"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(boites.sty) tex(boites_exemples.sty) texlive-boites"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(color.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
