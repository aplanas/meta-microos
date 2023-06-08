SUMMARY = "TeX usage web pages, in Polish"
DESCRIPTION = "TeX Virtual Academy is a bundle of Polish documentation in HTML \
format about TeX and Co. It contains information for beginners, \
LaTeX packages, descriptions, etc."
LICENSE = "GFDL-1.3-or-later"

PV = "2023.201.svn34177"

RPM_NAME = "texlive-tex-virtual-academy-pl-2023.201.svn34177-54.1.noarch.rpm"
RPM_HASH = "8540b7f89bb610b0ec8997edd1366f727b6f59c92c022bcce434fc388a6dd17d72e4f5f325aaeecc1154dde558f8264f00731b9ed23a049e1b43e0cff4c3ff59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-virtual-academy-pl"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
