SUMMARY = "Use OpenType math font Fira Math"
DESCRIPTION = "The package offers XeTeX/LuaTeX support for the Sans Serif \
OpenType Fira Math Font."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.03asvn65561"

RPM_NAME = "texlive-firamath-otf-2023.201.0.0.03asvn65561-52.1.noarch.rpm"
RPM_HASH = "4ae368069a31f22032678b298b13effdfaab4a33287bcb70d71304199caf8c84d1e8520a9f54a15057a6fd9ebfc7ca369538c4350f9407164eff5fb48a42a4f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(firamath-otf.sty) texlive-firamath-otf"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(iftex.sty) tex(textcomp.sty) tex(unicode-math.sty) tex(xfakebold.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
