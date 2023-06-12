SUMMARY = "LaTeX thesis template for Fudan University"
DESCRIPTION = "This package is a LaTeX thesis template package for Fudan \
University. It can make it easy to write theses both in Chinese \
and English."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9svn66188"

RPM_NAME = "texlive-fduthesis-2023.201.0.0.9svn66188-52.1.noarch.rpm"
RPM_HASH = "6569db0da8aaf2652d55baaf163af6c9c414b8342088afa4c5e38e62a5bdb9558ac9eb4ee40ae7b7e35831bc953aef031ab9b26fb5001262be4f5c9e9fd6fe76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fdudoc.cls) \
tex(fdulogo.sty) \
tex(fduthesis-en.cls) \
tex(fduthesis.cls) \
tex(fduthesis.def) \
texlive-fduthesis"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(biblatex.sty) \
tex(ctex.sty) \
tex(gbt7714.sty) \
tex(hyperref.sty) \
tex(l3doc.cls) \
tex(l3keys2e.sty) \
tex(luatex85.sty) \
tex(natbib.sty) \
tex(pdfpages.sty) \
tex(pifont.sty) \
tex(tikz.sty) \
tex(xcolor.sty) \
tex(xtemplate.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
