SUMMARY = "Greek letters in math mode from Libertinus or Linux Libertine/Biolinum"
DESCRIPTION = "This package allows LaTeX users (especially if using \
traditional LaTeX/pdfLaTeX) to set the Greek letters in math \
mode to use the glyphs from the Libertinus Serif or Sans font, \
via the font support files provided by the libertinus-type1 \
package of Bob Tennent. All Greek letters are defined both in \
\\...up and \\...it variants. The style (ISO, TeX, or French i. \
e. upright) can be modified midway in the document. A 'legacy' \
mode uses font support from the (obsolete) package \
https://ctan.org/pkg/libertine-legacy which map to the Linux \
Libertine or Biolinum fonts. This package is for users which \
only want to customize Greek letters in math mode."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn65004"

RPM_NAME = "texlive-libgreek-2023.201.1.1svn65004-54.1.noarch.rpm"
RPM_HASH = "06e22c6e5f862f82a5dd063100914bfe6bfabf250dec06f6c2e5b7551e3b139dbab2f15713ef53b787e0d3f5e5cf5615fec7c917080757e3f0b0fde3ab0008da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(libgreek-legacy.sty) tex(libgreek.sty) texlive-libgreek"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(kvoptions.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
