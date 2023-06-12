SUMMARY = "COntent-Oriented LaTeX"
DESCRIPTION = "The package (COntent Oriented LaTeX) gives LaTeX the power to \
retain mathematical meaning of its expressions in addition to \
the typsetting instructions; essentially separating style from \
the content of the math. One advantage of keeping mathematical \
meaning is that conversion of LaTeX documents to other \
executable formats (such as Content MathML or Mathematica code) \
is greatly simplified. The package requires the coolstr, \
coollist and forloop packages."
LICENSE = "LGPL-2.1-or-later"

PV = "2023.204.1.35svn15878"

RPM_NAME = "texlive-cool-2023.204.1.35svn15878-54.1.noarch.rpm"
RPM_HASH = "1c979ed1277e2a40ba0eda42fd0965c8ccbe7817bfde64514a83b91e7301728ebaaeb6511a47994d905e38251ab21b92805730aef87c386d782a118bfaafdcc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cool.sty) \
texlive-cool"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(bbm.sty) \
tex(coollist.sty) \
tex(coolstr.sty) \
tex(forloop.sty) \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
