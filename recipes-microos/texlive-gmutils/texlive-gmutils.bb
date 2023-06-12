SUMMARY = "Support macros for other packages"
DESCRIPTION = "Miscellaneous macros used by others of the author's packages. \
Contents of the package: \\newgif and other globals; \\@ifnextcat \
and \\@ifXeTeX; \\(Re)storeMacro(s) to override redefinitions; \
\\afterfi and friends; commands from relsize, etc.; 'almost an \
environment' or redefinition of \\begin (\\begin* doesn't check \
if the argument environment is defined)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.996svn24287"

RPM_NAME = "texlive-gmutils-2023.201.0.0.996svn24287-53.1.noarch.rpm"
RPM_HASH = "4630ea516bbedde65af7b6ca01a3b5ed8f09d8b6dcf3c6d62b2812c477c315fa259bb788945ba9ae22464a88666877e9d265e178222ef340380a422804a016b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gmRCS.sty) \
tex(gmampulex.sty) \
tex(gmbase.sty) \
tex(gmcommand.sty) \
tex(gmenvir.sty) \
tex(gmlogos.sty) \
tex(gmmeta.sty) \
tex(gmmw.sty) \
tex(gmnotonlypream.sty) \
tex(gmparts.sty) \
tex(gmrelsize.sty) \
tex(gmtypos.sty) \
tex(gmurl.sty) \
tex(gmutils.sty) \
texlive-gmutils"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(expl3.sty) \
tex(graphicx.sty) \
tex(multicol.sty) \
tex(polski.sty) \
tex(xkeyval.sty) \
tex(xltxtra.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
