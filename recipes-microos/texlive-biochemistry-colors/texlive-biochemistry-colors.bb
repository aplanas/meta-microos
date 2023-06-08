SUMMARY = "Colors used to display amino acids, nucleotides, sugars or atoms in biochemistry"
DESCRIPTION = "Biochemistry-colors.sty defines the standard colors of \
biochemistry for use with the color package and the xcolor \
package. xcolor is loaded by Biochemistry-colors.sty. Colors \
include: Shapely-colors for amino acids and nucleotides. \
CPK-Colors (Corey, Pauling and Koltun) of elements. Jmol-colors \
of elements, important isotopes and structures. Glycopedia \
colors for sugars."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.00svn54512"

RPM_NAME = "texlive-biochemistry-colors-2023.201.1.00svn54512-53.1.noarch.rpm"
RPM_HASH = "a114a066d45d7cc4321a50b1e5c5c18c65b2e61c5c4f79161b36db4e8aa7cf637632c036ed28bb0c7c693746634383eacf6efa386d32420208f8cf47c01993df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(Biochemistry-colors.sty) texlive-biochemistry-colors"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(xcolor.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
