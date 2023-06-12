SUMMARY = "Severed fonts for texlive-simpleicons"
DESCRIPTION = "The  separated fonts package for texlive-simpleicons"
LICENSE = "LPPL-1.0"

PV = "2023.201.8.6.0svn66328"

RPM_NAME = "texlive-simpleicons-fonts-2023.201.8.6.0svn66328-53.1.noarch.rpm"
RPM_HASH = "8d77cebbc3bf14a7f837e8e7c802f3220163714dbadc2243fd8b5a3af7e23ad4be018c0907004241afa625e051b4930430ebca29d7fc2240af5018863a915b80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-simpleicons-fonts) \
font(simpleicons) \
texlive-simpleicons-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
