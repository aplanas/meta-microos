SUMMARY = "Improve the performance of \\see macros with makeindex"
DESCRIPTION = "The package amends the \\see and \\seealso macros that are used \
in building indexes with makeindex, to deal with repetitions, \
and to ensure page numbers are present in the actual index \
entries. on these indirecty"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn43595"

RPM_NAME = "texlive-seealso-2023.201.1.2svn43595-53.1.noarch.rpm"
RPM_HASH = "2b3a0258d532b54ba4cf77036766e6aa9ae78c7d2870248d9605251607c68af4c2ed814d350484918363d726879ee7fbe6ab801bf92d831282dad45258d3c045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(seealso.sty) texlive-seealso"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(etoolbox.sty) tex(kvoptions.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
