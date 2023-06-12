SUMMARY = "Dutch language module for the datetime2 package"
DESCRIPTION = "This module provides the 'dutch' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47355"

RPM_NAME = "texlive-datetime2-dutch-2023.201.1.1svn47355-52.1.noarch.rpm"
RPM_HASH = "b7af671bdc8a0d01b78dd1904e81aedd1fca624a69db429cd14de73d3f1cc588710f26c7e315d6a57b31908a3822b92dbe2280b269f3861adff33e52a3e01ad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-dutch.ldf) \
texlive-datetime2-dutch"
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
