SUMMARY = "Slides with a simple Power Point like appearance"
DESCRIPTION = "A slide format which produces slides with a simple Power Point \
like appearance. Several useful features include: use of \
standard titlepage to produce title slide; several slide \
environments including plain (page with a title), double slide \
(two column page with slide title), item slide (item list with \
title), left item slide, and right item slide. Logos are placed \
in the upper left corner of each slide if the logo file \
logo.eps is present. Preconfigured in landscape mode by default \
and uses Times Roman by default (originally, it was claimed, \
for simple conversion to PDF format)."
LICENSE = "Artistic-1.0"

PV = "2023.201.svn27354"

RPM_NAME = "texlive-uwmslide-2023.201.svn27354-53.1.noarch.rpm"
RPM_HASH = "3efbf4c44855868f7843e695cb1d12ffde8e7f0d57eabd359b43296c417ba200982ce86075659cecb1904432494cc5048fbe8a8ce1d6582fe66a1317e0553b28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(uwmslide.cls) texlive-uwmslide"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(article.cls) tex(epsfig.sty) tex(times.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
