SUMMARY = "Upper Sorbian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'usorbian' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn52375"

RPM_NAME = "texlive-datetime2-usorbian-2023.201.1.1svn52375-52.1.noarch.rpm"
RPM_HASH = "204cb6fb62442b207cc50332620d61d05bf0c13cf4d5a12abda24b00ab87da49d6201bae2de9d5f01eefcdccaad0c180f03f8804ad0aa407f5e986d6cf7f21b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(datetime2-usorbian-ascii.ldf) \
tex(datetime2-usorbian-utf8.ldf) \
tex(datetime2-usorbian.ldf) \
texlive-datetime2-usorbian"
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
