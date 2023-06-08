SUMMARY = "XTU thesis template"
DESCRIPTION = "The package provides a thesis template for the Xiangtan \
University."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn47049"

RPM_NAME = "texlive-xtuthesis-2023.201.1.0svn47049-52.1.noarch.rpm"
RPM_HASH = "3713ab7371da82314ff9a96b71d7f34c3bb239327569432b1b9d843a20c184382f84d03c2f2d59dfa22957ad9c45cdc7954935637f4db536156f2437eb9223e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xtuformat.sty) texlive-xtuthesis"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(algorithm2e.sty) tex(amscd.sty) tex(amsfonts.sty) tex(amsmath.sty) tex(amssymb.sty) tex(bm.sty) tex(caption.sty) tex(cite.sty) tex(color.sty) tex(graphicx.sty) tex(latexsym.sty) tex(mathrsfs.sty) tex(xcolor.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
