SUMMARY = "Modifies the amsmath equation environments to warn for a displaced equation number"
DESCRIPTION = "Sometimes an equation is too long that an equation number will \
be typeset below the equation itself, but yet not long enough \
to yield an 'overfull \\hbox' warning. The eqnnumwarn package \
modifies the standard amsmath numbered equation environments to \
throw a warning whenever this occurs."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn45511"

RPM_NAME = "texlive-eqnnumwarn-2023.201.1.0svn45511-53.1.noarch.rpm"
RPM_HASH = "ef673a098f4673183164eb84057cb3e022bb92d6e0bce737ab77668062375e8560e102bdab6ca9027258fc5352ea85135c52b45f3dc51f98690e4f23e6b3a48f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(eqnnumwarn.sty) texlive-eqnnumwarn"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(calc.sty) tex(environ.sty) tex(etoolbox.sty) tex(mathtools.sty) tex(tikz.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
