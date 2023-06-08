SUMMARY = "Manage book edited in other entry type"
DESCRIPTION = "This package provides new BibLaTeX entry types and fields for \
book edited in other types, like for instance @bookinarticle. \
It offers more types than the older package \
biblatex-bookinarticle which it superseeds."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3.3svn54015"

RPM_NAME = "texlive-biblatex-bookinother-2023.201.2.3.3svn54015-53.1.noarch.rpm"
RPM_HASH = "c0620a02468e037e1a612042f8b371071c8458f84be993150e6c5c2a68c2ed1471d240786a9b71a685c74644eadec7bbe21f41ee6b07265e58a05f9e2ab2b779"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bookinother.bbx) texlive-biblatex-bookinother"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(xpatch.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
