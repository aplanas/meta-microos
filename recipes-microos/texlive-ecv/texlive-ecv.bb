SUMMARY = "A fancy Curriculum Vitae class"
DESCRIPTION = "The class provides an environment for creating a fancily laid \
out tabular curriculum vitae inspired by the european \
curriculum vitae. The distribution comes with a German and an \
English template."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn24928"

RPM_NAME = "texlive-ecv-2023.201.0.0.3svn24928-53.1.noarch.rpm"
RPM_HASH = "f2b15f9ac79f018149e2237dd251865649f991b34b0041ba5b7d1ad7f63bd06c76a8f3ad09f43b5bc3dc640bdcf9308b68900f90b28336d26053e5610bcda2c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ecv.cls) tex(ecvEnglish.ldf) tex(ecvGerman.ldf) tex(ecvNLS.sty) texlive-ecv"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(article.cls) tex(babel.sty) tex(fancyhdr.sty) tex(fontenc.sty) tex(geometry.sty) tex(helvet.sty) tex(hyperref.sty) tex(ifpdf.sty) tex(ifthen.sty) tex(inputenc.sty) tex(longtable.sty) tex(paralist.sty) tex(pgf.sty) tex(selinput.sty) tex(url.sty) tex(xcolor.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
