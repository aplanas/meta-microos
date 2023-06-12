SUMMARY = "Severed fonts for texlive-xcharter-math"
DESCRIPTION = "The  separated fonts package for texlive-xcharter-math"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.36svn65686"

RPM_NAME = "texlive-xcharter-math-fonts-2023.201.0.0.36svn65686-52.1.noarch.rpm"
RPM_HASH = "77d5310ce6ceddac8d35a14ffe4a4e9fc8e069e639586fc019cfe17f615b4b284f1d044c0bfee8ef5bbc539c1c178c7b56de9ef5ce6e39efc91ae3f16e290fd3"
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
font(xcharter-math-bold) \
font(xchartermath) \
texlive-xcharter-math-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
