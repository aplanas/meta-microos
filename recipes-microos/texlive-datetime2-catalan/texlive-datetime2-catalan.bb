SUMMARY = "Catalan language module for the datetime2 package"
DESCRIPTION = "This module provides the 'catalan' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47032"

RPM_NAME = "texlive-datetime2-catalan-2023.201.1.1svn47032-52.1.noarch.rpm"
RPM_HASH = "d1be5c5a9acb892eff69d7faed2b60fe8cf9e5dd4480bc1d3b03a46d344b1bd92d0cdd1cf61ea2170abfccd90dba29cfc1ecd45d7a3a566c227bb670650ff4b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-catalan-ascii.ldf) \
tex(datetime2-catalan-utf8.ldf) \
tex(datetime2-catalan.ldf) \
texlive-datetime2-catalan"
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
