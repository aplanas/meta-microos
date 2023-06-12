SUMMARY = "French language module for the datetime2 package"
DESCRIPTION = "This module provides the 'french' style that can be set using \
\\DTMsetstyle provided by datetime2.sty."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn56393"

RPM_NAME = "texlive-datetime2-french-2023.201.1.03svn56393-52.1.noarch.rpm"
RPM_HASH = "256b39229ef8a7a63ec36b46e1b9bbf48992bae16215369d3749f7592d94fc9238060e7f58eb16aef5041ad410c7d922cff125c9989df911ca64bf86e489203e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-french-ascii.ldf) \
tex(datetime2-french-utf8.ldf) \
tex(datetime2-french.ldf) \
texlive-datetime2-french"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
