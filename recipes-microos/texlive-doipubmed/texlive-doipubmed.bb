SUMMARY = "Special commands for use in bibliographies"
DESCRIPTION = "The package provides the commands \\doi, \\pubmed and \\citeurl. \
These commands are primarily designed for use in \
bibliographies. A LaTeX2HTML style file is also provided."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn15878"

RPM_NAME = "texlive-doipubmed-2023.201.1.01svn15878-52.1.noarch.rpm"
RPM_HASH = "9113677b25048c5c5af8def1d3aa55328f8b34f86ce4b6b701959e1c1939bb3059855e3bb75cde55b762fc10f3a0d75dd57063bbf231e905b8e0d838f235e4c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(doipubmed.sty) texlive-doipubmed"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(url.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
