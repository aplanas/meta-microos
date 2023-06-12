SUMMARY = "Class for typesetting letters to Swiss rules"
DESCRIPTION = "The class enables composition of letters fitting into Swiss C5 \
& C6/5 windowed envelopes. No assumption is made about the \
language used. The class is based on the standard LaTeX classes \
and is compatible with the LaTeX letter class. It is not \
limited to letters and may be used as a generic document class; \
it is used with the chextras package."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn20060"

RPM_NAME = "texlive-chletter-2023.201.2.0svn20060-53.1.noarch.rpm"
RPM_HASH = "144343e16a1f2b9e65e92e0cd3e9f7062d5211e8b0a7922c14d0362fdd82504d7ff686f4985aec6ffbe2ae38e4a62b05cf6ccb69e8d564b5d3a878d96288d9fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(chletter.cls) \
texlive-chletter"
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
