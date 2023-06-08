SUMMARY = "Severed fonts for texlive-aboensis"
DESCRIPTION = "The  separated fonts package for texlive-aboensis"
LICENSE = "OFL-1.1"

PV = "2023.201.svn62977"

RPM_NAME = "texlive-aboensis-fonts-2023.201.svn62977-54.1.noarch.rpm"
RPM_HASH = "acc8f3f1839c4508d7ca3bf77bfd74d08845cf485d3895e2a3de9bdd2b8fdf460fb1e47008144f1ac44ef5cc60af7f30a8a73473a43be6f9820e0a080166cd95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=fj) font(:lang=ho) font(:lang=ia) font(:lang=io) font(:lang=kj) font(:lang=kwm) font(:lang=ms) font(:lang=ng) font(:lang=nr) font(:lang=om) font(:lang=rn) font(:lang=rw) font(:lang=sn) font(:lang=so) font(:lang=ss) font(:lang=st) font(:lang=sw) font(:lang=ts) font(:lang=uz) font(:lang=xh) font(:lang=za) font(:lang=zu) font(aboensis) texlive-aboensis-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
