SUMMARY = "Interactive editor and macro support for prerequisite charts"
DESCRIPTION = "This package consists of prerex.sty, a LaTeX package for \
producing charts of course nodes linked by arrows representing \
pre- and co-requisites, and prerex, an interactive program for \
creating and editing chart descriptions. The implementation of \
prerex.sty uses PGF, so that it may be used equally happily \
with LaTeX or pdfLaTeX; prerex itself is written in C. The \
package includes source code for a previewer application, a \
lightweight Qt-4 and poppler-based prerex-enabled PDF viewer."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn54512"

RPM_NAME = "texlive-prerex-2023.201.svn54512-52.1.noarch.rpm"
RPM_HASH = "a88ef84909b3d9d0b85abe1e7283c8dfeaf382f53b2380efc908d584ff29e3f5244981d8dd316275bc2587ea2acf2d1db096dd584550adb066f7795bdf2e3262"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(prerex.sty) \
texlive-prerex"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(calc.sty) \
tex(hyperref.sty) \
tex(pgf.sty) \
tex(relsize.sty) \
tex(textcomp.sty) \
tex(tikz.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
