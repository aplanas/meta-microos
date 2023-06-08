SUMMARY = "Using the OpenType fonts TeX Gyre Pagella"
DESCRIPTION = "This package can only be used with LuaLaTeX or XeLaTeX. It does \
the font setting for the OpenType font 'TeX Gyre Pagella' for \
text and math. The missing typefaces like bold math and slanted \
text are also defined"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn64705"

RPM_NAME = "texlive-pagella-otf-2023.201.0.0.02svn64705-51.1.noarch.rpm"
RPM_HASH = "887c3f14b1f7a6eb6aba90fca91217976425d12937dc5f746761f79e5e2320213fc4883c19ac13d0b10e9d7fcabd4b0c6bf925ea14d9b891936d251d63b17fbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pagella-otf.sty) texlive-pagella-otf"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(iftex.sty) tex(textcomp.sty) tex(unicode-math.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
