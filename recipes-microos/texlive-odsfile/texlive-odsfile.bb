SUMMARY = "Read OpenDocument Spreadsheet documents as LaTeX tables"
DESCRIPTION = "The distribution includes a package and a lua library that can \
together read OpenDocument spreadsheet documents as LaTeX \
tables. Cells in the tables may be processed by LaTeX macros, \
so that (for example) the package may be used for drawing some \
plots. The package uses lua's zip library."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn65268"

RPM_NAME = "texlive-odsfile-2023.201.0.0.7svn65268-54.1.noarch.rpm"
RPM_HASH = "87a5bffb12cdf099a36316a18c098248a083528756bd09a0732b7fc5d66d2dcdbdff6ea28659c314254e2eda0fd580e28809b9f9e9d9c62f98bec059e3166dd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(odsfile.sty) texlive-odsfile"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(luacode.sty) tex(xkeyval.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
