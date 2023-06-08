SUMMARY = "A collection of add-ons and bugfixes for PSTricks"
DESCRIPTION = "Collects together examples that have been posted to the \
PSTricks mailing list, together with many additional features \
for the basic pstricks, pst-plot and pst-node, including: \
bugfixes; new options for the pspicture environment; arrows; \
braces as node connection/linestyle; extended axes for plots \
(e.g., logarithm axes); polar plots; plotting tangent lines of \
curves or functions; solving and printing differential \
equations; box plots; matrix plots; and pie charts. The package \
makes use of PostScript routines provided by pst-math."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.93svn65067"

RPM_NAME = "texlive-pstricks-add-2023.201.3.93svn65067-53.1.noarch.rpm"
RPM_HASH = "d2ea5c096a411cbb43832f972e7f0e21ef4e6b002da885d5394334c35881151fe35a5096863b35ee9d82c6e9b4ce29109bc31988983ea226be463ead5123961e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pstricks-add.sty) tex(pstricks-add.tex) texlive-pstricks-add"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(multido.sty) tex(pst-3d.sty) tex(pst-calculate.sty) tex(pst-math.sty) tex(pst-node.sty) tex(pst-plot.sty) tex(pstricks.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
