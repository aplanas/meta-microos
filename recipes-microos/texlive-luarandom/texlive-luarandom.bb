SUMMARY = "Create lists of random numbers"
DESCRIPTION = "This package can create lists of random numbers for any given \
interval [a;b]. It is possible to get lists with or without \
multiple numbers. The random generator will be initialized by \
the system time. The package can only be used with LuaLaTeX!"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn49419"

RPM_NAME = "texlive-luarandom-2023.201.0.0.01svn49419-52.1.noarch.rpm"
RPM_HASH = "6ef357863855f5a10bc2feb79283df39cc9cba7b0146d4019942dd2743753309ec47ca628dd1b85a878b3d00963112dab248f447a67c27a4cf2b36639c5a123c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(luarandom.sty) \
texlive-luarandom"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifluatex.sty) \
tex(luacode.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
