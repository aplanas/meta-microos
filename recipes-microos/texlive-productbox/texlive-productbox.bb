SUMMARY = "Typeset a three-dimensional product box"
DESCRIPTION = "The package enables typesetting of a three-dimensional product \
box. This product box can be rendered as it is standing on a \
surface and some light is shed onto it. Alternatively it can be \
typeset as a wireframe to be cut out and glued together. This \
will lead to a physical product box. The package requires pgf \
and TikZ."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn20886"

RPM_NAME = "texlive-productbox-2023.201.1.1svn20886-52.1.noarch.rpm"
RPM_HASH = "1d2418b43c6c395046490c375cfed9cb5cf9097396e8e67235b51691abc5128b627c024311078d758328843d5b31e44b45be048959b8b073d5473d94d1c8c74c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(productbox.sty) texlive-productbox"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(keyval.sty) tex(tikz.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
