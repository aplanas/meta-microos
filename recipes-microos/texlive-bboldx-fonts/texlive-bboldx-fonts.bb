SUMMARY = "Severed fonts for texlive-bboldx"
DESCRIPTION = "The  separated fonts package for texlive-bboldx"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.032svn65424"

RPM_NAME = "texlive-bboldx-fonts-2023.201.1.032svn65424-53.1.noarch.rpm"
RPM_HASH = "ea5156a170b6b22e10a6453e34e4c6e720c19b6d66fc57b4990f13832afe110c47e4837c3951b2d37b09fb5ca780d841942820574f943ca24fea920484e3473f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=fj) \
font(:lang=ho) \
font(:lang=ia) \
font(:lang=io) \
font(:lang=kj) \
font(:lang=kwm) \
font(:lang=ms) \
font(:lang=ng) \
font(:lang=nr) \
font(:lang=om) \
font(:lang=rn) \
font(:lang=rw) \
font(:lang=sn) \
font(:lang=so) \
font(:lang=ss) \
font(:lang=st) \
font(:lang=sw) \
font(:lang=ts) \
font(:lang=uz) \
font(:lang=xh) \
font(:lang=za) \
font(:lang=zu) \
font(bboldx) \
texlive-bboldx-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
