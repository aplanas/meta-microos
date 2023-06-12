SUMMARY = "Alternative language support for Omega/Lambda"
DESCRIPTION = "A language support package for Omega/Lambda. This replaces the \
original omega package for use with Lambda, and provides extra \
facilities (including Babel-like language switching, which \
eases porting of LaTeX documents to Lambda)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8svn21933"

RPM_NAME = "texlive-antomega-2023.201.0.0.8svn21933-54.1.noarch.rpm"
RPM_HASH = "7432e7e11e654abe5826cca9bc8a24da661854a0e50beb50f798dc5e26aeeba791ca1de5193781b49cc8f90ad09d4b0ceafe2a9fbd831bade5a043436f7eb698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(antomega.cfg) \
tex(antomega.sty) \
tex(grhyph16.tex) \
tex(hyphen.cfg) \
tex(lgc0700.def) \
tex(lgrenc-antomega.def) \
tex(ograhyph4.tex) \
tex(ogrmhyph4.tex) \
tex(ogrphyph4.tex) \
tex(omega-english.ldf) \
tex(omega-french.ldf) \
tex(omega-german.ldf) \
tex(omega-greek.ldf) \
tex(omega-latin.ldf) \
tex(omega-latvian.ldf) \
tex(omega-polish.ldf) \
tex(omega-russian.ldf) \
tex(omega-spanish.ldf) \
tex(ruhyph16.tex) \
tex(t1enc-antomega.def) \
tex(t2aenc-antomega.def) \
tex(uni0100.def) \
tex(uni0370.def) \
tex(uni0400.def) \
tex(uni1f00.def) \
tex(ut1enc-antomega.def) \
texlive-antomega"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(ifthen.sty) \
tex(keyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-omega \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
