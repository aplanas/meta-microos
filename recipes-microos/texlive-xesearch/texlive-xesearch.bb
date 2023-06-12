SUMMARY = "A string finder for XeTeX"
DESCRIPTION = "The package finds strings (e.g. (parts of) words or phrases) \
and manipulates them (apply any macro), thus turning each word \
or phrase into a possible command. It is written in plain XeTeX \
and should thus work with any format (it is known to work with \
LaTeX and ConTeXt). The main application for the moment is \
XeIndex, an automatic index for XeLaTeX, but examples are given \
of simple use to check spelling, count words, and highlight \
syntax of programming languages."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn51908"

RPM_NAME = "texlive-xesearch-2023.201.0.0.2svn51908-52.1.noarch.rpm"
RPM_HASH = "66ff107abc822f34a8976e2b7e5d3ba47bdfc1d31e548ee013bd6da806471c626d9920a93ce52bb738364861b14022f8d67fd625176b4aaf3930e1acb7ed92cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(t-xesearch.tex) \
tex(xesearch.sty) \
texlive-xesearch"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
