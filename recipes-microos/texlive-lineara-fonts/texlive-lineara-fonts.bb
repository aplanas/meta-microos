SUMMARY = "Severed fonts for texlive-lineara"
DESCRIPTION = "The  separated fonts package for texlive-lineara"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63169"

RPM_NAME = "texlive-lineara-fonts-2023.201.svn63169-54.1.noarch.rpm"
RPM_HASH = "1242c189272009b2784e18f57c031c659d1db8d1ada2ace328cbb48968760c4be63498220aacac1399dba4ddd05df3349159cde9948efad0103bb11a73c84a78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(lineara) font(linearacmplxsigns) texlive-lineara-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
