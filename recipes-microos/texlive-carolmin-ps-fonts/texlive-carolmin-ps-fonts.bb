SUMMARY = "Severed fonts for texlive-carolmin-ps"
DESCRIPTION = "The  separated fonts package for texlive-carolmin-ps"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-carolmin-ps-fonts-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "5120f0a8a16b5d92661fdefc83f779d78c27a50e6b4130580a95f6c10b4b8a67eb3cfe251713520f5408793ed45834ee8da2bb36828f06ce8ac44f0f580e67b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=fj) font(:lang=ho) font(:lang=ia) font(:lang=io) font(:lang=kj) font(:lang=kwm) font(:lang=ms) font(:lang=ng) font(:lang=nr) font(:lang=om) font(:lang=rn) font(:lang=rw) font(:lang=sn) font(:lang=so) font(:lang=ss) font(:lang=st) font(:lang=sw) font(:lang=ts) font(:lang=uz) font(:lang=xh) font(:lang=za) font(:lang=zu) font(carolinganminuscules) texlive-carolmin-ps-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
