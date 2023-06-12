SUMMARY = "New column types for array and tabular environments"
DESCRIPTION = "This small package provides new column types for array and \
tabular environments, horizontally and vertically centered, or \
with adjusted height for big mathematical expressions. The \
columns width can be fixed or calculated like in tabularx \
environments. Macros for drawing vertical and horizontal rules \
of variable thickness are also provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn61719"

RPM_NAME = "texlive-arraycols-2023.201.1.2svn61719-53.1.noarch.rpm"
RPM_HASH = "8e649bdf1c76d56654f9159917fb224c83e389998f48981b94785e8b428513f186d1c293c205aaa3804c5f318a99810f513ff890e1082ec61c8de4c2515a0230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(arraycols.sty) \
texlive-arraycols"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
tex(cellspace.sty) \
tex(makecell.sty) \
tex(tabularx.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
