SUMMARY = "Turkish language module for the datetime2 package"
DESCRIPTION = "This module provides the 'turkish' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn52331"

RPM_NAME = "texlive-datetime2-turkish-2023.201.1.1svn52331-52.1.noarch.rpm"
RPM_HASH = "9bf36db67578f487531a63fb81fc3e550556b1febb9109b8425802a9dc69bba3a664b96f740823e19ef58e979215a9458813ce60d0ff65be56a04ff91fa94024"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-turkish-ascii.ldf) \
tex(datetime2-turkish-utf8.ldf) \
tex(datetime2-turkish.ldf) \
texlive-datetime2-turkish"
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
