SUMMARY = "Extends eTeX's \\numexpr...\\relax construct to big integers"
DESCRIPTION = "The package extends e-TeX \\numexpr...\\relax operation to allow \
big integers, powers, factorials, truncated division and its \
associated modulo. By default, bnumexpr loads package xintcore \
(part of the xint bundle) and uses its arithmetic macros."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn59244"

RPM_NAME = "texlive-bnumexpr-2023.201.1.5svn59244-52.1.noarch.rpm"
RPM_HASH = "b7000552b9319d625e71b449d5e88dea6a1328624de4b6aa101ad313402b6dcc59a2be3e315e17ce7b3d56b495f33bfb8dce0b8e6ff03dfcac9d8d8b409b2597"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bnumexpr.sty) \
texlive-bnumexpr"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(xintbinhex.sty) \
tex(xintcore.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
