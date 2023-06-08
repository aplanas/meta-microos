SUMMARY = "North Dakota State University disquisition class"
DESCRIPTION = "A class for generating disquisitions, intended to be in \
compliance with North Dakota State University requirements."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn46639"

RPM_NAME = "texlive-ndsu-thesis-2023.201.svn46639-54.1.noarch.rpm"
RPM_HASH = "50b43ba8ead99e28f97371e80281327236b9066e3df3202088370d0344f58ddffbf71ca710b27624adfd9d1d8d27b0aea4ab699fcae1179ff80d7e2e9fbbc7bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ndsu-thesis.cls) texlive-ndsu-thesis"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(book.cls) tex(caption.sty) tex(comment.sty) tex(etoolbox.sty) tex(geometry.sty) tex(hyperref.sty) tex(ifthen.sty) tex(indentfirst.sty) tex(inputenc.sty) tex(newfloat.sty) tex(setspace.sty) tex(tikz.sty) tex(titlesec.sty) tex(titling.sty) tex(tocbibind.sty) tex(tocloft.sty) tex(totalcount.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
