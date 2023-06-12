SUMMARY = "Separate color stack for footnotes with pdfTeX"
DESCRIPTION = "Since version 1.40 pdfTeX supports several colour stacks. This \
package uses a separate colour stack for footnotes that can \
break across pages. The package is part of the oberdiek bundle."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn65512"

RPM_NAME = "texlive-pdfcolfoot-2023.201.1.4svn65512-51.1.noarch.rpm"
RPM_HASH = "8be8838f169cbf723fa474f13bc38c26cf4799168b4b2ac70541d766835c943553a0a3200d8b67a86abf64cc8cbfe0131ffeb6a3eff6bc1c8368e11c6a7f9669"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pdfcolfoot.sty) \
texlive-pdfcolfoot"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pdfcol.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
