SUMMARY = "Severed fonts for texlive-arphic-ttf"
DESCRIPTION = "The  separated fonts package for texlive-arphic-ttf"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn42675"

RPM_NAME = "texlive-arphic-ttf-fonts-2023.201.svn42675-53.1.noarch.rpm"
RPM_HASH = "2e387f8f558b594939f264a7bc0415ad7aa5451aad2d9440ce47ccacee9ce1ce5077d4ea9576db9858c57c1cfcacd3fb5afa369b584bdb79959cf25c773fb69b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "font(:lang=bg) font(:lang=fj) font(:lang=ho) font(:lang=ia) font(:lang=io) font(:lang=kj) font(:lang=kum) font(:lang=kwm) font(:lang=ms) font(:lang=ng) font(:lang=nr) font(:lang=om) font(:lang=os) font(:lang=rn) font(:lang=ru) font(:lang=rw) font(:lang=sel) font(:lang=sn) font(:lang=so) font(:lang=ss) font(:lang=st) font(:lang=sw) font(:lang=ts) font(:lang=uz) font(:lang=xh) font(:lang=za) font(:lang=zh-cn) font(:lang=zh-sg) font(:lang=zh-tw) font(:lang=zu) font(arplkaitimbig5) font(arplkaitimgb) font(arplmingti2lbig5) font(arplsungtilgb) font(文鼎ｐｌ中楷) font(文鼎ｐｌ简中楷) font(文鼎ｐｌ简报宋) font(文鼎ｐｌ細上海宋) texlive-arphic-ttf-fonts"
RDEPENDS:${PN} += "/bin/sh aaa_base coreutils fontconfig ghostscript-fonts-std perl"

inherit rpm
