SUMMARY = "Curriculum vitae for French use"
DESCRIPTION = "The package allows the user to set up a curriculum vitae as a \
French employer will expect."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn59638"

RPM_NAME = "texlive-esieecv-2023.201.svn59638-53.1.noarch.rpm"
RPM_HASH = "fcde8477139ab5a88637465bc9d9912731b7588f4cac0287945c3334a6fc933a967a01e3c066c970afc3dd7468490ddc160b74081fc257469d9b1e8abc0e604d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ESIEEcv.sty) texlive-esieecv"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(tabularx.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
