SUMMARY = "Thesis class for Eszterhazy Karoly Catholic University"
DESCRIPTION = "This is a class file for theses and dissertations at the \
Eszterhazy Karoly Catholic University (Eger, Hungary). The \
documentation is in Hungarian."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2svn60228"

RPM_NAME = "texlive-thesis-ekf-2023.201.4.2svn60228-54.1.noarch.rpm"
RPM_HASH = "a811036385285e23de4d355a52607ae711da98a27b61dd26bc1ec428da836c4c617d37ecd90ad3557a764cea54dc38fccac71f4d1fd702ac1706085d5ff26ff1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(thesis-ekf.cls) texlive-thesis-ekf"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(cmap.sty) tex(cmupint.sty) tex(etoolbox.sty) tex(fixcmex.sty) tex(fontsize.sty) tex(geometry.sty) tex(graphicx.sty) tex(hyperref.sty) tex(iftex.sty) tex(kvoptions.sty) tex(lmodern.sty) tex(newtxmath.sty) tex(newtxtext.sty) tex(report.cls) tex(setspace.sty) tex(upquote.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
