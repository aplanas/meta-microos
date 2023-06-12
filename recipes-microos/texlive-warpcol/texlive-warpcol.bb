SUMMARY = "Relative alignment of rows in numeric columns in tabulars"
DESCRIPTION = "Defines a tabular column type for formatting numerical columns \
in LaTeX. The column type enables numerical items to be right \
justified relative to each other, while centred beneath the \
column label. In addition, macros are provided to enable \
variations on this column type to be defined. Usage of the \
package is superficially similar to that of dcolumn; however, \
the alignment scheme is different, and the packages have \
different, though overlapping, applications."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0csvn15878"

RPM_NAME = "texlive-warpcol-2023.201.1.0csvn15878-53.1.noarch.rpm"
RPM_HASH = "40c3b6fdcbbea78b97f91e0ecfd297078176979e1d43aa89dd97ee7d1685e5e5cab3201428e73b117186732e61aad12dfb33135707e7dbbdbff1a9596263c905"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(warpcol.sty) \
texlive-warpcol"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
