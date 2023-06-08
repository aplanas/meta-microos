SUMMARY = "Format menu sequences, paths and keystrokes from lists"
DESCRIPTION = "This package is designed to format menu sequences, paths and \
keyboard shortcuts automatically. There are several predefined \
styles and one can define one's own styles in a flexible way."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6.2svn64314"

RPM_NAME = "texlive-menukeys-2023.201.1.6.2svn64314-54.1.noarch.rpm"
RPM_HASH = "722113e685308bd1edce081ba5b742b4ecba8a0e00b3f609746e00da2169327c8872d2d3593f75b25613a3f02ea0de91fcbf6900809c684fc0e330c91ef4a485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(menukeys-2020-12-19.sty) tex(menukeys.sty) texlive-menukeys"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(adjustbox.sty) tex(etoolbox.sty) tex(kvoptions.sty) tex(relsize.sty) tex(tikz.sty) tex(xcolor.sty) tex(xparse.sty) tex(xstring.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
