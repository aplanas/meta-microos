SUMMARY = "Process lists to do repetitive actions"
DESCRIPTION = "The package provides commands to simplify processing of \
sequential list-like structures, such as making a series of \
'similar' commands from a list of names."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn25552"

RPM_NAME = "texlive-lmake-2023.201.1.0svn25552-54.1.noarch.rpm"
RPM_HASH = "2a210ca6f00004f1fd15670ce3472748874bf70657ee0cf0cf691982770348f18c21c26847377975245da9cdaf8433b298694d1fa734ff52c61b4989bab45a6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lmake.sty) texlive-lmake"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
