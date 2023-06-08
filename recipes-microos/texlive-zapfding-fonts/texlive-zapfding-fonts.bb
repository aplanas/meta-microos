SUMMARY = "Severed fonts for texlive-zapfding"
DESCRIPTION = "The  separated fonts package for texlive-zapfding"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn61719"

RPM_NAME = "texlive-zapfding-fonts-2023.201.svn61719-52.1.noarch.rpm"
RPM_HASH = "a1ed92c0be492dded500ca332b7ececdb5138503f15a0b8a93a8dacccf574546188d14ea2324b31d8d4692a9fd5d921b4b22de106dc5dcd7d61d8d3b9e89a9f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(dingbats) texlive-zapfding-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
