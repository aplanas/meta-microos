SUMMARY = "Macros to generate quantum ciruits"
DESCRIPTION = "The package supports those within the quantum information \
community who typeset quantum circuits, using xy-pic package, \
offering macros designed to help users generate circuits."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.6.0svn48400"

RPM_NAME = "texlive-qcircuit-2023.201.2.6.0svn48400-53.1.noarch.rpm"
RPM_HASH = "f1c2b8ea6930b58a4b2c361f02834687f04eb58e6a0ff05756517a765a5bd9576200eba9627ea822c2f23422dfdda98d933c41cc4648027d4a4fe464a308322a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(qcircuit.sty) \
texlive-qcircuit"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifpdf.sty) \
tex(xy.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
