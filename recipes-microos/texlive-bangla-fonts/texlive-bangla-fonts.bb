SUMMARY = "Severed fonts for texlive-bangla"
DESCRIPTION = "The  separated fonts package for texlive-bangla"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn65786"

RPM_NAME = "texlive-bangla-fonts-2023.201.2.1svn65786-53.1.noarch.rpm"
RPM_HASH = "4687412a0819987f35a3e7902bd2990f9923bd7f6bd3ed3e59512555f75057b3ad23e91e6b483724f5eaaac86fc61de5ef71dcc46fc5263f81669b9ae63800c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=as) \
font(:lang=bn) \
font(:lang=fj) \
font(:lang=ho) \
font(:lang=ia) \
font(:lang=io) \
font(:lang=kj) \
font(:lang=kwm) \
font(:lang=mni) \
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
font(kalpurush) \
font(shimanto) \
texlive-bangla-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
