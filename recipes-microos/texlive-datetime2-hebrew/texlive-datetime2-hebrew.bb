SUMMARY = "Hebrew language module for the datetime2 package"
DESCRIPTION = "This module provides the 'hebrew' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47534"

RPM_NAME = "texlive-datetime2-hebrew-2023.201.1.1svn47534-52.1.noarch.rpm"
RPM_HASH = "915e8b9221a1249fa3c48a29e7b89df12ea678fc81bc136a0b934d94facad356f7d709775609260fe367694aa2455a7d41ba36768847ee9cb6734a11098fc7eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-hebrew.ldf) \
texlive-datetime2-hebrew"
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
