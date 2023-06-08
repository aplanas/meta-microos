SUMMARY = "Macros for French teachers of mathematics"
DESCRIPTION = "A collection of macros for French maths teachers in colleges \
and lycees (and perhaps elsewhere). It is hoped that the \
package will facilitate the everyday use of LaTeX by \
mathematics teachers."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn15878"

RPM_NAME = "texlive-tdsfrmath-2023.201.1.3svn15878-54.1.noarch.rpm"
RPM_HASH = "e63442536d01f9cc524fb2adde65a5127dca2f9afc444fb9110fa8598c26cae1732ceade66f3b93c5e4ab1f7df82a37b95ac2a03338354af9f2814f7a9e624f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tdsfrmath.sty) texlive-tdsfrmath"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(amssymb.sty) tex(ifthen.sty) tex(stmaryrd.sty) tex(suffix.sty) tex(xargs.sty) tex(xkeyval.sty) tex(xspace.sty) tex(xstring.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
