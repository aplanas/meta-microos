SUMMARY = "A font for Arabic-based writing systems in Nigeria and Niger"
DESCRIPTION = "This font is designed for Arabic-based writing systems in the \
Kano region of Nigeria and Niger."
LICENSE = "OFL-1.1"

PV = "2023.201.1.000svn44497"

RPM_NAME = "texlive-alkalami-2023.201.1.000svn44497-54.1.noarch.rpm"
RPM_HASH = "ed897950da4dc505ec9dd92de13f5d0422948871543159177020dd52a398d62077e3c498e15bf668a8104f11a626952d86b13da5babcc5712173907eb2e472ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alkalami"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-alkalami-fonts texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
