SUMMARY = "Severed fonts for texlive-euler-math"
DESCRIPTION = "The  separated fonts package for texlive-euler-math"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.31svn65685"

RPM_NAME = "texlive-euler-math-fonts-2023.201.0.0.31svn65685-52.1.noarch.rpm"
RPM_HASH = "69f4cdc3e982d6bdc55e162437c87c9fe14e739dd2bde426f0f10bf7eff30e43d564d7f397ef70d3b7353cae47f71e628735a45cf6fb1fd996f47a2f4de20a9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=fj) font(:lang=ho) font(:lang=ia) font(:lang=io) font(:lang=kj) font(:lang=kwm) font(:lang=ms) font(:lang=ng) font(:lang=nr) font(:lang=om) font(:lang=rn) font(:lang=rw) font(:lang=sn) font(:lang=so) font(:lang=ss) font(:lang=st) font(:lang=sw) font(:lang=ts) font(:lang=uz) font(:lang=xh) font(:lang=za) font(:lang=zu) font(eulermath) texlive-euler-math-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
