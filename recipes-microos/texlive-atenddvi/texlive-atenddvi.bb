SUMMARY = "Provides the \\AtEndDvi command"
DESCRIPTION = "This package is unneeded and does nothing when used with a \
LaTeX format 2020-10-01 or newer as in this case the format \
provides the \\AtEndDvi command. For older formats it implements \
\\AtEndDvi, a counterpart to \\AtBeginDvi. The execution of its \
argument is delayed to the end of the document at the end of \
the last page. Thus \\special and \\write remain effective, \
because they are put into the last page. This is the main \
difference to \\AtEndDocument."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn56922"

RPM_NAME = "texlive-atenddvi-2023.201.1.5svn56922-53.1.noarch.rpm"
RPM_HASH = "dba392604e6562f81846b9c49c159a225dc8c698929f61e514e4d3e9e6a043520681f85aac57e85095bdcfd657dbddd4bb76fff2d7c18dee9daecaa68c244700"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(atenddvi-2019-12-11.sty) \
tex(atenddvi.sty) \
texlive-atenddvi"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(atbegshi.sty) \
tex(zref-abspage.sty) \
tex(zref-lastpage.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
