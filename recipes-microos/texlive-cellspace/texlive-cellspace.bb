SUMMARY = "Ensure minimal spacing of table cells"
DESCRIPTION = "It is well known that high or deep cells tend to touch the \
\\hlines of a tabular. This package provides a modifier S acting \
on usual column types so that to ensure a minimal distance that \
can be controlled through two parameters \\cellspacetoplimit and \
\\cellspacebottomlimit. The approach employed by this package is \
noticeably simpler than that of tabls, which considers the \
dimensions of each entire row; whereas you can ask the \
cellspace only to look at the cells of potentially difficult \
columns. The package depends on ifthen, array, calc, and \
xkeyval."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9.0svn61501"

RPM_NAME = "texlive-cellspace-2023.201.1.9.0svn61501-52.1.noarch.rpm"
RPM_HASH = "95f2ad9239813b4befd41b5495ccaaac7a8a4974f8b514ea27768a0796435316a086b165cd5b9cc76ed34850649185faa655b5ae7a8e9050427c3ae09b82a50e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cellspace.sty) texlive-cellspace"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(array.sty) tex(calc.sty) tex(ifthen.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
