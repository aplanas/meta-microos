SUMMARY = "Provides PDF color spaces"
DESCRIPTION = "The package provides PDF color spaces. Currently, only spot \
colors and overprinting are supported. It requires xcolor, and \
supports pdfTeX and LuaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn50585"

RPM_NAME = "texlive-colorspace-2023.201.1.3svn50585-53.1.noarch.rpm"
RPM_HASH = "2006702c8a4f72807e6f9ce5406ac621fd68f657caa02563e5caed26a6a639c765275951c21bb14a3fd4be1ea1469546cb02f9bc7315f08ade71e468f9f8e959"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(colorspace.sty) \
texlive-colorspace"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
