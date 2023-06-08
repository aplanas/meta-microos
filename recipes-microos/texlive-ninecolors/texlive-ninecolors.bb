SUMMARY = "Select colors with proper WCAG color contrast"
DESCRIPTION = "This package carefully selects and defines 9 colors for 13 hues \
each. All colors with the same suffix number have equal \
luminance level. Also the color black is of level 0, and the \
color white is of level 10. By simply choosing two colors in \
the above list, which differ in level by at least 5, as \
foreground and background colors, you will get proper WCAG \
Color Contrast."
LICENSE = "LPPL-1.0"

PV = "2023.201.2022dsvn62006"

RPM_NAME = "texlive-ninecolors-2023.201.2022dsvn62006-54.1.noarch.rpm"
RPM_HASH = "7690216eb25b3d30d9621510d43ffc574b5eaa912a27291f91c5ee62c4ce5cea7d05b4301e7a32864ec47d59d30fade826b46cffc6e82b1d4de39adffe2a5c0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ninecolors.sty) texlive-ninecolors"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(xcolor.sty) tex(xparse.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
