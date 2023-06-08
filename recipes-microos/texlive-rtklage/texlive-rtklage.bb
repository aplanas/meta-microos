SUMMARY = "A package for German lawyers"
DESCRIPTION = "RATeX is a newly developed bundle of packages and classes \
provided for German lawyers. Now in the early beginning it only \
contains rtklage, a class to make lawsuits."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-rtklage-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "e203f82da889710d4c5d692e912cf53a3befe73851c5a4b227a0b734d341a516d6bf11b95b0d4fb079123dcc76bbde457011fb1859af36f61b234124b49dfb68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(rtklage.cls) texlive-rtklage"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(alphanum.sty) tex(babel.sty) tex(calc.sty) tex(color.sty) tex(eso-pic.sty) tex(graphicx.sty) tex(ifthen.sty) tex(numprint.sty) tex(scrdate.sty) tex(twoopt.sty) tex(xspace.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
