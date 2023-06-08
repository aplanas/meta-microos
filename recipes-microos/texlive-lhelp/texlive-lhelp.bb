SUMMARY = "Miscellaneous helper packages"
DESCRIPTION = "This package defines macros which are useful for many \
documents. It is a large collection of simple 'little helpers' \
which do not really warrant a separate package on their own. \
Included are, among other things, definitions of common units \
with preceeding thinspaces, framed boxes where both width and \
height can be specified, starting new odd or even pages, draft \
markers, notes, conditional includes, including EPS files, and \
versions of enumerate and itemize which allow the horizontal \
and vertical spacing to be changed."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.0svn23638"

RPM_NAME = "texlive-lhelp-2023.201.2.0svn23638-54.1.noarch.rpm"
RPM_HASH = "a5500ea31f1da34c254efb12600dd52a6487aae632cd2142a61afce511ed598d46cd2ac83f5f6199ce6f2c08d70104750acbfa4b740db93abb39daed9506227d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lhelp.sty) texlive-lhelp"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(color.sty) tex(graphics.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
