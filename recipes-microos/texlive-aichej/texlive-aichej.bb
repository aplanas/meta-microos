SUMMARY = "Bibliography style file for the AIChE Journal"
DESCRIPTION = "The style was generated using custom-bib, and implements the \
style of the American Institute of Chemical Engineers Journal \
(or AIChE Journal or AIChE J or AIChEJ)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-aichej-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "35f085d83609e8ebaa78920a15e4eaa878f94ff9c41831f6a7e4fe17a230ea11cabced7f7f758b08155095da4d16d2c0c492c32a23a49ca59cc048f1f7d2b554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aichej"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
