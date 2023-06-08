SUMMARY = "Create beautiful scientific Persian/Latin posters using TikZ"
DESCRIPTION = "This package is designed for making beautiful scientific \
Persian/Latin posters. It is a fork of baposter by Brian Amberg \
and Reinhold Kainhofer available at \
http://www.brian-amberg.de/uni/poster/. baposter's users should \
be able to compile their poster using xebaposter (instead of \
baposter) without any problem."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.53svn63513"

RPM_NAME = "texlive-xebaposter-2023.201.2.53svn63513-52.1.noarch.rpm"
RPM_HASH = "ab83df9ec87387945fa5c3f7f2de670c7488bd2b90c80a7ee78d5edd863c225b06bae21315eede682ebc0715ffd9955ec1780d8718f424ce7abb2d77a8c5d545"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xebaposter.cls) texlive-xebaposter"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(article.cls) tex(calc.sty) tex(fontenc.sty) tex(ifthen.sty) tex(ifxetex.sty) tex(pgf.sty) tex(pgfpages.sty) tex(tikz.sty) tex(xcolor.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
