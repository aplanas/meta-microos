SUMMARY = "Miscellaneous macros from Joachim Schrod"
DESCRIPTION = "A bunch of packages, including: idverb.tex, for 'short \
verbatim'; xfig.tex, for including xfig/transfig output in a \
TeX document; and cassette.tex for setting cassette labels."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn16211"

RPM_NAME = "texlive-js-misc-2023.201.svn16211-55.1.noarch.rpm"
RPM_HASH = "68ea3e8acf32010a3ac36f38dc5b53e495785516a9c386f86a4ee462301e934e61fb52bd3eee1c6cf0cb543db616b642514f24b0164e9ca9bf6b7bedbe440fd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cassette.tex) tex(idverb.tex) tex(js-misc.tex) tex(schild.tex) tex(sperr.tex) tex(xfig.tex) texlive-js-misc"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
