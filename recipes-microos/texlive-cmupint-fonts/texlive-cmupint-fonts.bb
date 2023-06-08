SUMMARY = "Severed fonts for texlive-cmupint"
DESCRIPTION = "The  separated fonts package for texlive-cmupint"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn54735"

RPM_NAME = "texlive-cmupint-fonts-2023.201.1.1svn54735-53.1.noarch.rpm"
RPM_HASH = "d7d6f425fc17d56e6a4f53b96c9128a784a731d6feff71f18c7dcd3c92192c268b5dd807b489521fea9076f36c2eb7d030c7871ffce93fb7eba9f7813c732661"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(cmupint) texlive-cmupint-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
