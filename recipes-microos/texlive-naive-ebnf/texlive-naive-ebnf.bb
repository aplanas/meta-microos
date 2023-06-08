SUMMARY = "EBNF in Plain Text"
DESCRIPTION = "With the help of this LaTeX package a context-free grammar \
(CFG) may be rendered in a plain-text mode using a simplified \
Extended Backus-Naur Form (EBNF) notation."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.5svn66017"

RPM_NAME = "texlive-naive-ebnf-2023.201.0.0.0.5svn66017-54.1.noarch.rpm"
RPM_HASH = "806127cbadd49d0b252bbd0607827e1ce78393c33a2fd35d82b89be7e50223f92b1659113cc04d2075240978e757b9f9e5a390c202d3c4be886f33ed880b0186"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(naive-ebnf.sty) texlive-naive-ebnf"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(expl3.sty) tex(pgfopts.sty) tex(xcolor.sty) texlive texlive-filecontentsdef texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-l3kernel texlive-pgfopts texlive-scripts texlive-scripts-bin"

inherit rpm
