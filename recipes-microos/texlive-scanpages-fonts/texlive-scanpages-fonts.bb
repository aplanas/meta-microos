SUMMARY = "Severed fonts for texlive-scanpages"
DESCRIPTION = "The  separated fonts package for texlive-scanpages"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.05asvn42633"

RPM_NAME = "texlive-scanpages-fonts-2023.201.1.05asvn42633-53.1.noarch.rpm"
RPM_HASH = "9c65267d6d1085879d4604daabc16a0ac87403c8f6f414dc5d375b3dd13cccc8919f4b4e70b997b7a62b4e3599469980cced6735587a8479316de6277a9d1edc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(scanwipe) texlive-scanpages-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
