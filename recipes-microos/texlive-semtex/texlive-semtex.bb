SUMMARY = "Deals with stripped SemanTeX documents"
DESCRIPTION = "This package is a small LaTeX package that adds a collection of \
simple macros for parentheses and bullets. It exists for one \
purpose only: To be loaded by documents which were originally \
typeset using the package SemanTeX, but which have been \
stripped of SemanTeX markup using the package stripsemantex \
which is part of SemanTeX. Therefore, unless your document is \
one of those, simply don't use this package. And even if your \
document is one of those, there is a good chance you will not \
have to load it after all. In most cases, you will be able to \
replace the macros it provides by macros from other packages."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.45svn56530"

RPM_NAME = "texlive-semtex-2023.201.0.0.45svn56530-53.1.noarch.rpm"
RPM_HASH = "f7b9e4b75dce0b354f00e1fea72449eea7117ccc92e4fc85e80e63c2b2734f50cec603a882bea1e2be10ad70df7cbf7790abf210d529b0d46477fe1147865225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(semtex.sty) \
texlive-semtex"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
