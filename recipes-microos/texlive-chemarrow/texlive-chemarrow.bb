SUMMARY = "Arrows for use in chemistry"
DESCRIPTION = "This bundle consists of a font (available as Metafont source, \
MetaPost source, and generated type 1 versions), and a package \
to use it. The arrows in the font are designed to look more \
like those in chemistry text-books than do Knuth's originals."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.9svn17146"

RPM_NAME = "texlive-chemarrow-2023.201.0.0.9svn17146-53.1.noarch.rpm"
RPM_HASH = "7113ae25bc0b249a4aea17b18d054a32cfb9c1dd641dc05cc7dbd5baf5fef132cde38bc90f3536cd6927b571005d0e95d1f9c1b7068d1bf6e0acf977600c2a33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(arrow.tfm) tex(chemarrow.map) tex(chemarrow.sty) texlive-chemarrow"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(updmap.cfg) texlive texlive-chemarrow-fonts texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
