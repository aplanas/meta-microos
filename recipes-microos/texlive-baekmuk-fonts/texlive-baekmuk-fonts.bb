SUMMARY = "Severed fonts for texlive-baekmuk"
DESCRIPTION = "The  separated fonts package for texlive-baekmuk"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2.1svn56915"

RPM_NAME = "texlive-baekmuk-fonts-2023.201.2.2.1svn56915-53.1.noarch.rpm"
RPM_HASH = "5e9afd53ae46bef5f902a6303a88d950fdfb0a5764cab1e9b9c0e47b06383bee1a8fb44d8086daad274f562c4c2cbc3d7f7e383b70a2c9eb50ee08213a3b0eb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=bg) font(:lang=fj) font(:lang=ho) font(:lang=ia) font(:lang=io) font(:lang=kj) font(:lang=ko) font(:lang=kum) font(:lang=kwm) font(:lang=lg) font(:lang=ms) font(:lang=ng) font(:lang=nr) font(:lang=om) font(:lang=os) font(:lang=rn) font(:lang=ru) font(:lang=rw) font(:lang=sel) font(:lang=sn) font(:lang=so) font(:lang=ss) font(:lang=st) font(:lang=sw) font(:lang=ts) font(:lang=uz) font(:lang=xh) font(:lang=za) font(:lang=zu) font(baekmukbatang) font(baekmukdotum) font(baekmukgulim) font(baekmukheadline) font(백묵굴림) font(백묵돋움) font(백묵바탕) font(백묵헤드라인) texlive-baekmuk-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
