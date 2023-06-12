SUMMARY = "Class for UIUC thesis red-bordered forms"
DESCRIPTION = "The class offers a means of filling out the 'red-bordered form' \
that gets signed by the department head, your advisor, and -- \
for doctoral dissertations -- your thesis committee members."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.00svn29974"

RPM_NAME = "texlive-uiucredborder-2023.201.1.00svn29974-53.1.noarch.rpm"
RPM_HASH = "e0d24422631a047ea9453cce0a29438d62ad5430380a5490e3e836c39e90d69b987c93259a298812b7b533eb513e7ce61351b38c5aa45f00133123a4074b611f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(uiucredborder.cls) \
texlive-uiucredborder"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(geometry.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
