SUMMARY = "Formulas and graphs for the EO programming language"
DESCRIPTION = "This LaTeX package helps you write [?] -calculus formulas and \
SODG graphs for the EO programming language."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.12.1svn66274"

RPM_NAME = "texlive-eolang-2023.201.0.0.12.1svn66274-53.1.noarch.rpm"
RPM_HASH = "4caf623beb51cd0b3936f833767f8db7fbf7926c9d8bdcd1d578d9f58bc9c57f5136f52943880deac1274fe58296ad23faeb5b345015f36c7e42111b493f656f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(eolang.sty) \
texlive-eolang"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsfonts.sty) \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(fancyvrb.sty) \
tex(hyperref.sty) \
tex(iexec.sty) \
tex(ifluatex.sty) \
tex(ifxetex.sty) \
tex(pdftexcmds.sty) \
tex(pgfopts.sty) \
tex(stmaryrd.sty) \
tex(tikz.sty) \
tex(trimclip.sty) \
tex(xstring.sty) \
texlive \
texlive-amsfonts \
texlive-amsmath \
texlive-fancyvrb \
texlive-filesystem \
texlive-iexec \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgf \
texlive-pgfopts \
texlive-scripts \
texlive-scripts-bin \
texlive-stmaryrd"

inherit rpm
