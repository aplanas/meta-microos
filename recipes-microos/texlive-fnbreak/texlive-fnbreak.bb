SUMMARY = "Warn for split footnotes"
DESCRIPTION = "This package detects footnotes that are split over several \
pages, and writes a warning to the log file."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.30svn25003"

RPM_NAME = "texlive-fnbreak-2023.201.1.30svn25003-52.1.noarch.rpm"
RPM_HASH = "d0f02e3c2e3b3cb6b7983b8dad8a228e3e1a11f67da2ffbc0cda0a7f1df9f2cde39fabee66e9ee58a9d0029706087550bba5d9ac34586023c3c2a2f1c97eebd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(fnbreak.sty) \
texlive-fnbreak"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
