SUMMARY = "Print TeX-related names as logo"
DESCRIPTION = "This package is more or less an extension to Heiko Oberdiek's \
package hologo. It prints TeX-related names as logos. The \
package requires fetamont, hologo, dantelogo, and xspace."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.09svn63261"

RPM_NAME = "texlive-hvlogos-2023.201.0.0.09svn63261-52.1.noarch.rpm"
RPM_HASH = "aa32c5b019f8bf37a0f207fde838afeb9a9fce7c3b8665d3a9f653fc530741bbdf3904c6a2ce7523799f85f352f3a98a40e65975fc3f8ab5eb5e135cce177ff2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hvlogos.sty) \
texlive-hvlogos"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(dantelogo.sty) \
tex(expl3.sty) \
tex(fetamont.sty) \
tex(hologo.sty) \
tex(unicode-math.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
