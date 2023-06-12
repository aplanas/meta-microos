SUMMARY = "Extended and more robust version of pgfkeys"
DESCRIPTION = "The package extends and improves the robustness of the pgfkeys \
package. In particular, it can deal with active comma, equality \
sign, and slash in key parsing. The difficulty with active \
characters has long been a problem with the pgfkeys package. \
The package also introduces handlers beyond those that pgfkeys \
can offer."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.1svn26093"

RPM_NAME = "texlive-pgfkeyx-2023.201.0.0.0.1svn26093-51.1.noarch.rpm"
RPM_HASH = "f75eefc43f852e9222b76380508a70fcc55c6e4f0fb0b05777d29b075752edcbc2f8aca23d4bbe9c90806b8a9a283693bb4a86974cfde593cf4590f38407ad85"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pgfkeyx.sty) \
texlive-pgfkeyx"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pdftexcmds.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
