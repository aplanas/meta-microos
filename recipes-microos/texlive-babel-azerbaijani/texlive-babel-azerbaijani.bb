SUMMARY = "Support for Azerbaijani within babel"
DESCRIPTION = "This is the babel style for Azerbaijani. This language poses \
special challenges because no 'traditional' font encoding \
contains the full character set, and therefore a mixture must \
be used (e.g., T2A and T1). This package is compatible with \
Unicode engines (LuaTeX, XeTeX), which are very likely the most \
convenient way to write Azerbaijani documents."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn44197"

RPM_NAME = "texlive-babel-azerbaijani-2023.201.1.0asvn44197-53.1.noarch.rpm"
RPM_HASH = "01c709256f47ca36b5f02b21a605270dd2dd45ee3422c65614e5f7fd30f61d844bcab18e7eae6678a129ee961abd97135aba7a187a2dae5828a0bb3f09ac61f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(azerbaijani.ldf) \
texlive-babel-azerbaijani"
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
