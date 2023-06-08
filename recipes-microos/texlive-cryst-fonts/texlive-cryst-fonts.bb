SUMMARY = "Severed fonts for texlive-cryst"
DESCRIPTION = "The  separated fonts package for texlive-cryst"
LICENSE = "LPPL-1.0"

PV = "2023.204.svn15878"

RPM_NAME = "texlive-cryst-fonts-2023.204.svn15878-54.1.noarch.rpm"
RPM_HASH = "770290009246998c416d4240c6a34e7f7ad3a8481bc2d13c83cba7ded8af6382ff45cc1112f43e01d5ae438df619ccd7c8039ec2a14efae24955bab4f07f665a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(cryst1) texlive-cryst-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
