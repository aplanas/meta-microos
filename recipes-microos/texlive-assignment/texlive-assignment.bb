SUMMARY = "A class file for typesetting homework and lab assignments"
DESCRIPTION = "A class file for typesetting homework and lab assignments."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20431"

RPM_NAME = "texlive-assignment-2023.201.svn20431-53.1.noarch.rpm"
RPM_HASH = "e71d91abdd5222d8612989b50eb85231b77e89d916ee061386eacac64f9729f54729dd35babe20ce76e77b73617aac69be2a915e95d350683992b24e27d3e766"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(assignment.cls) texlive-assignment"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(article.cls) tex(ifthen.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
