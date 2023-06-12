SUMMARY = "Severed fonts for texlive-countriesofeurope"
DESCRIPTION = "The  separated fonts package for texlive-countriesofeurope"
LICENSE = "OFL-1.1"

PV = "2023.204.0.0.23svn54512"

RPM_NAME = "texlive-countriesofeurope-fonts-2023.204.0.0.23svn54512-54.1.noarch.rpm"
RPM_HASH = "6528650c4f5503f8fb3e9a29dc8dd8821bd7e5f35745364c16896f5b39c286862a4adf8ad4348bb37bf5892f3c74920fd8b317489690f65a51a64be5eb0c9b8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(texlive-countriesofeurope-fonts) \
font(:lang=fj) \
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
font(countriesofeurope) \
texlive-countriesofeurope-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
