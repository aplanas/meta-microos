SUMMARY = "Control pagestyle of pages left blank by \\cleardoublepage"
DESCRIPTION = "This tiny package allows easy manipulation of the headers and \
footers on pages left blank by \\cleardoublepage. By default, \
LaTeX has no easy facilities for this. This package uses more \
or less the algorithm listed in the fancyhdr package \
documentation, with some better indentation and added \
flexibility."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn47511"

RPM_NAME = "texlive-clrdblpg-2023.201.1.0svn47511-53.1.noarch.rpm"
RPM_HASH = "521dbd70652cfb9a61f4f19b66e9488c56f63765a7d4ae1d1a40b1fff599bb2a48c7c86c1c58377271b44fbd5519c5dfb35920f35e5ec332a608739d0c2ce550"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(clrdblpg.sty) texlive-clrdblpg"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
