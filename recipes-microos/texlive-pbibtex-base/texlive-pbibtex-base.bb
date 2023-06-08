SUMMARY = "Bibliography styles and miscellaneous files for pBibTeX"
DESCRIPTION = "These are miscellaneous files, including bibliography styles \
(.bst), for pBibTeX, which is a Japanese extended version of \
BibTeX contained in TeX Live. The bundle is a redistribution \
derived from the ptex-texmf distribution by ASCII MEDIA WORKS."
LICENSE = "BSD-3-Clause"

PV = "2023.201.svn66085"

RPM_NAME = "texlive-pbibtex-base-2023.201.svn66085-51.1.noarch.rpm"
RPM_HASH = "16541f1903d7f24666b36564c15d155fc2e15588b99c916f8afd158f717d2d45809648fec29349058f4da7156fdfa090129a790875ba38f41b8884601439874e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pbibtex-base"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
