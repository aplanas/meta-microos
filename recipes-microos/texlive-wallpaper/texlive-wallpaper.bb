SUMMARY = "Easy addition of wallpapers (background images) to LaTeX documents, including tiling"
DESCRIPTION = "This collection contains files to add wallpapers (background \
images) to LaTeX documents. It uses the eso-pic package, but \
provides simple commands to include effects such as tiling. An \
example is provided, which works under both LaTeX and pdfLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10svn15878"

RPM_NAME = "texlive-wallpaper-2023.201.1.10svn15878-53.1.noarch.rpm"
RPM_HASH = "039e3a1271f5dae691b6ea1ea310607b905ee308e6e5110a826286a23c12733f5cf6bcea757e114f871b8f45a218ff1a25b135fba48042cb0115dbae2d53b1c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(wallpaper.sty) texlive-wallpaper"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(calc.sty) tex(eso-pic.sty) tex(graphicx.sty) tex(ifthen.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
