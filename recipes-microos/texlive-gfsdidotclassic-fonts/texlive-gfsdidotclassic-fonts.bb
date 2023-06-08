SUMMARY = "Severed fonts for texlive-gfsdidotclassic"
DESCRIPTION = "The  separated fonts package for texlive-gfsdidotclassic"
LICENSE = "OFL-1.1"

PV = "2023.201.001.001svn52778"

RPM_NAME = "texlive-gfsdidotclassic-fonts-2023.201.001.001svn52778-52.1.noarch.rpm"
RPM_HASH = "6ef2f74aa9f2ec42368cfd6f6221cae33728ca5b846e52419c986a49ea98ae51313eddec24e1e16301176ddc5c3ae62f10274a8deb658c6b0aa828b38b7173f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=el) font(gfsdidotclassic) texlive-gfsdidotclassic-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
