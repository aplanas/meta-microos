SUMMARY = "Severed fonts for texlive-rojud"
DESCRIPTION = "The  separated fonts package for texlive-rojud"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn56895"

RPM_NAME = "texlive-rojud-fonts-2023.201.1.2svn56895-53.1.noarch.rpm"
RPM_HASH = "988d1afb80696364f0013015184cc76b6e9917bfc2bfab3042700837dc7fbb27fa54babcc7c33728568a6592381bfba46387c6a50724ea10831a943067cbf65d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(rojud) \
texlive-rojud-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
