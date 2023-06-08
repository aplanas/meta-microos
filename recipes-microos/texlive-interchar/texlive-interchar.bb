SUMMARY = "Managing character class schemes in XeTeX"
DESCRIPTION = "The package manages character class schemes of XeTeX. Using \
this package, you may switch among different character class \
schemes. Migration commands are provided for make packages \
using this mechanism compatible with each others."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn36312"

RPM_NAME = "texlive-interchar-2023.201.0.0.2svn36312-52.1.noarch.rpm"
RPM_HASH = "19cef0df82010eed9d7e0ef8db79fab0f8686ddc905cf6907794b3d85cb6cd9d6221bb37744a15f69f7a4c15182f2f8df2e172ed530407339cf9c9caf8f1fa16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(interchar.sty) texlive-interchar"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(expl3.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
