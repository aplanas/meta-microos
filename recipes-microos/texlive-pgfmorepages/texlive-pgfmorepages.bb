SUMMARY = "Assemble multiple logical pages onto a physical page"
DESCRIPTION = "This package replaces and extends the pgfpages sub-package of \
the PGF system. It provides the capability to arrange multiple \
'logical' pages on multiple 'physical' pages, for example as \
for arranging pages to make booklets."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.20svn54770"

RPM_NAME = "texlive-pgfmorepages-2023.201.1.20svn54770-51.1.noarch.rpm"
RPM_HASH = "22d11c299ac53024fa838b98ef128387572350c78591eed5e732d7fb43c3c54b1b12fc496134cd1d7071194eb1325f2c1e4ddff4eff7c1693f9b4d267e3779e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pgfmorepages.sty) \
tex(pgfmorepageslayouts.code.tex) \
texlive-pgfmorepages"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(pgfcore.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
