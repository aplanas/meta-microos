SUMMARY = "Severed fonts for texlive-dantelogo"
DESCRIPTION = "The  separated fonts package for texlive-dantelogo"
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.03svn38599"

RPM_NAME = "texlive-dantelogo-fonts-2023.204.0.0.03svn38599-54.1.noarch.rpm"
RPM_HASH = "bdf3dfad4d038367054101d1692478ab0d0a3208c4e0703cedca7aa5bdab1abca3f429d85b82b867e2852059d2a4863704847e004b7cf61f8aad5b7c05cb291e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-dantelogo-fonts) font(dante) texlive-dantelogo-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
