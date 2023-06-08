SUMMARY = "Severed fonts for texlive-plimsoll"
DESCRIPTION = "The  separated fonts package for texlive-plimsoll"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1svn56605"

RPM_NAME = "texlive-plimsoll-fonts-2023.201.1svn56605-52.1.noarch.rpm"
RPM_HASH = "45c0f431c87b7b7d97f72d139804fbdf078e6bca2b2878e0fd9d25421e107719dfbb1d0588f14ba9065a4110c6e75c20070f8f433ce4b3dee2124dd16cf28d15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(plimsoll) texlive-plimsoll-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
