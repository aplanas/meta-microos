SUMMARY = "Italian translation of amsthdoc: Using the amsthm package"
DESCRIPTION = "The amsthdoc-it package"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn45662"

RPM_NAME = "texlive-amsthdoc-it-2023.201.svn45662-54.1.noarch.rpm"
RPM_HASH = "e4e837ca583a8e28c2ef81a76deaa90297eb5a499a649629f977e177469f668e0577d7c416bcac0782ddba0370bf27add139b47ae2300ac122ed1db4f0e412bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amsthdoc-it"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
