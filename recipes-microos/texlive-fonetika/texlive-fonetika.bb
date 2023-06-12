SUMMARY = "Support for the Danish 'Dania' phonetic system"
DESCRIPTION = "Fonetika Dania is a font bundle with a serif font and a sans \
serif font for the danish phonetic system Dania. Both fonts \
exist in regular and bold weights. LaTeX support is provided. \
The fonts are based on URW Palladio and Iwona Condensed, and \
were created using FontForge."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21326"

RPM_NAME = "texlive-fonetika-2023.201.svn21326-52.1.noarch.rpm"
RPM_HASH = "cef21743e30ef4f496dae458730dd1a65d8ac9e81a210807b924389b7dad79dfc6c1db980f92e24c62dc07c52580cb7b985e2e8cc4bac486760b6fc05deb1598"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fonetika.map) \
tex(fonetika.sty) \
tex(fonetika.tfm) \
tex(fonetikabold.tfm) \
tex(fonetikasans.tfm) \
tex(fonetikasansbold.tfm) \
tex(t1fonetika.fd) \
texlive-fonetika"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontenc.sty) \
tex(updmap.cfg) \
texlive \
texlive-filesystem \
texlive-fonetika-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
