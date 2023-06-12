SUMMARY = "Severed fonts for texlive-niceframe-type1"
DESCRIPTION = "The  separated fonts package for texlive-niceframe-type1"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn44671"

RPM_NAME = "texlive-niceframe-type1-fonts-2023.201.svn44671-54.1.noarch.rpm"
RPM_HASH = "a90c75f92fd5adcc86d1b70216de185b5533cc50c0d292e1460431adf5fefe52dc678a54e1e7fa4af3a10f34382589a4ab89039f14f4c9b173d3e0f2bf9ae0df"
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
font(bbding) \
font(dingbat) \
font(karta) \
font(umranda) \
font(umrandb) \
texlive-niceframe-type1-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
