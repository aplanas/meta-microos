SUMMARY = "Severed fonts for texlive-foekfont"
DESCRIPTION = "The  separated fonts package for texlive-foekfont"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-foekfont-fonts-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "02e28f9a2d878a1fd22840f0e4a45bffd8f2949f8b8c4bd438234cac6aec569d3deb3270b720616bd2d0c4b220ce537219b67dc382bb16f52d1a9b1414792863"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(foekfont) \
texlive-foekfont-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
