SUMMARY = "Macros for typesetting basic arithmetic"
DESCRIPTION = "The package provides macros for typesetting basic arithmetic, \
in the style typically found in textbooks. It focuses on the \
American style of performing these algorithms. It is written \
mostly in low-level TeX, with the goal that it should run in \
either plain TeX or LaTeX, but there are two constructions that \
currently prevent this. It is highly configurable, with macros \
and lengths described in the documentation."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn35460"

RPM_NAME = "texlive-basicarith-2023.201.1.1svn35460-53.1.noarch.rpm"
RPM_HASH = "9c1bb752ba58f90beee5d129a4264349853799b1f3115488ad937c5381e680c86a0e13be0710a9c7258b4a53669dc9600f3bc0e209c7c3c65508521e5596f83e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(basicarith.sty) \
texlive-basicarith"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
