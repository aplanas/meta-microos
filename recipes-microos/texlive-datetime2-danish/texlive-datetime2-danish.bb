SUMMARY = "Danish language module for the datetime2 package"
DESCRIPTION = "This module provides the 'danish' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47034"

RPM_NAME = "texlive-datetime2-danish-2023.201.1.1svn47034-52.1.noarch.rpm"
RPM_HASH = "edf910b7180a75da0281fcd40e8bd09c5cabd67ff0a97ba63c408c875ff50d244e2b33a58096d6fc36e54bd51596c251b4706f4d4a03a7402ae21667f159cd69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-danish-ascii.ldf) \
tex(datetime2-danish-utf8.ldf) \
tex(datetime2-danish.ldf) \
texlive-datetime2-danish"
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
