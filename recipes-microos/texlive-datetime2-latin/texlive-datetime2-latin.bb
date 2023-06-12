SUMMARY = "Latin language module for the datetime2 package"
DESCRIPTION = "This module provides the 'latin' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn47748"

RPM_NAME = "texlive-datetime2-latin-2023.201.1.0svn47748-52.1.noarch.rpm"
RPM_HASH = "3a53322c1883a18b89c1c4d3f6ab0f678ddbd636de0ddaad94c1c4c2270f7b27f2654c5074e51177de47754ad2ff2cd59ac2ddef645bd8b52f50a27ae4cd2d3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-latin.ldf) \
texlive-datetime2-latin"
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
