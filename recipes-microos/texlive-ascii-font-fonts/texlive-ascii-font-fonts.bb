SUMMARY = "Severed fonts for texlive-ascii-font"
DESCRIPTION = "The  separated fonts package for texlive-ascii-font"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn29989"

RPM_NAME = "texlive-ascii-font-fonts-2023.201.2.0svn29989-53.1.noarch.rpm"
RPM_HASH = "fe77b835d7591729a94374165ae37eb600766222649af5bd2b13f3e8b82173cc5d2cb0e23c3d8e65c55ef6e9fe0cc297d6fa65e5c9119b5ccbe8f9cda4d596cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=fj) font(:lang=ho) font(:lang=ia) font(:lang=io) font(:lang=kj) font(:lang=kwm) font(:lang=ms) font(:lang=ng) font(:lang=nr) font(:lang=om) font(:lang=rn) font(:lang=rw) font(:lang=sn) font(:lang=so) font(:lang=ss) font(:lang=st) font(:lang=sw) font(:lang=ts) font(:lang=uz) font(:lang=xh) font(:lang=za) font(:lang=zu) font(ascii) texlive-ascii-font-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
