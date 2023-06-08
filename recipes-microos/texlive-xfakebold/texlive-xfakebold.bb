SUMMARY = "Fake a regular font for bold characters"
DESCRIPTION = "This package uses PDF's text rendering to modify the linewidth \
of an outline font to get bold characters. It works only for \
vectorfonts where the glyphs are defined by their outline. The \
package works both in text and in math mode, for pdfLaTeX as \
well as for LuaLaTeX. The package depends on ifluatex, ifxetex, \
and xkeyval."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.08svn55654"

RPM_NAME = "texlive-xfakebold-2023.201.0.0.08svn55654-52.1.noarch.rpm"
RPM_HASH = "314fe76c4af9790decf56e81f843b9f62e0d851ff3784f96f0a5dfab7246f4fdbe8d43972202293c108dd210048a44224d093605123f819c085fcc75a9120db9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xfakebold.sty) texlive-xfakebold"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(ifluatex.sty) tex(ifpdf.sty) tex(iftex.sty) tex(ifxetex.sty) tex(pdfrender.sty) tex(xkeyval.sty) texlive texlive-filesystem texlive-iftex texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
