SUMMARY = "Prints the version and date of a LaTeX class or style file"
DESCRIPTION = "This simple shell script prints the version and date of a LaTeX \
class or style file. Syntax: latexfileversion <file> This \
programme handles style files (extension .sty), class files \
(extension .cls), and other TeX input files. The file extension \
must be given."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn29349"

RPM_NAME = "texlive-latexfileversion-2023.201.0.0.3svn29349-54.1.noarch.rpm"
RPM_HASH = "7f6fc6ab0c66f52977ab5934464e9cc7dcdea31ae4a80277998f72beba9c8be645179db074db2860aa3df593ec13730a25eb173e3a7fb3abb9d95eb70a89a2f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexfileversion"
RDEPENDS:${PN} += "/bin/bash /bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-latexfileversion-bin texlive-scripts texlive-scripts-bin"

inherit rpm
