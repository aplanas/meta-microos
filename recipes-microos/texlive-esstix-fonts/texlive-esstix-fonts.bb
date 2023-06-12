SUMMARY = "Severed fonts for texlive-esstix"
DESCRIPTION = "The  separated fonts package for texlive-esstix"
LICENSE = "OFL-1.1"

PV = "2023.201.1.0svn22426"

RPM_NAME = "texlive-esstix-fonts-2023.201.1.0svn22426-52.1.noarch.rpm"
RPM_HASH = "26d641f69bceeb7a129be45e30f4a16836a547a2362b2dbd30c0f7b34ab534cb76e03af16a937462fd8bb135449c18f4f100d4b82d8999ac34f8e00229893c2f"
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
font(esstix-eight) \
font(esstix-eleven) \
font(esstix-fifteen) \
font(esstix-five) \
font(esstix-four) \
font(esstix-fourteen) \
font(esstix-nine) \
font(esstix-one) \
font(esstix-seven) \
font(esstix-seventeen) \
font(esstix-six) \
font(esstix-sixteen) \
font(esstix-ten) \
font(esstix-thirteen) \
font(esstix-three) \
font(esstix-twelve) \
font(esstix-two) \
texlive-esstix-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
fontconfig \
ghostscript-fonts-std \
perl"

inherit rpm
