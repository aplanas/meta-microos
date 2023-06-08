SUMMARY = "Drawing spectral sequences in LuaLaTeX"
DESCRIPTION = "The package is an update of the author's sseq package, for use \
with LuaLaTeX. This version uses less memory, and operates \
faster than the original; it also offers several enhancements."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65511"

RPM_NAME = "texlive-luasseq-2023.201.svn65511-52.1.noarch.rpm"
RPM_HASH = "5c521313466a006e68b1a2317ef0a15ca03a3ab791f43ee9e79140fe5243a55104e6fe321453b99af0b380376c25e777c43fd0445bb54377cf81cb38504ce588"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(luasseq.sty) texlive-luasseq"
RDEPENDS:${PN} += "/bin/sh /usr/bin/luatex coreutils ed findutils grep sed tex(calc.sty) tex(ifthen.sty) tex(pgf.sty) tex(pifont.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
