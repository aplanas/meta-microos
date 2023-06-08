SUMMARY = "Shape selection for PX fonts Greek letters"
DESCRIPTION = "The package allows LaTeX maths users of the PX fonts to select \
the shapes (italic or upright) for the Greek lowercase and \
uppercase letters. Once the shapes for lowercase and uppercase \
have been selected via a package option, the \\other prefix \
(e.g., \\otheralpha) allows using the alternate glyph (as in the \
fourier package). The pxgreeks package does not constrain the \
text font that may be used in the document."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn21838"

RPM_NAME = "texlive-pxgreeks-2023.201.1.0svn21838-53.1.noarch.rpm"
RPM_HASH = "b54508e19037f30e60fdb0d0706c95ec179c8426603a2c24e3f1325ac66b7444c5fbf4e40ed6e8d8248fc71e34e5f57c0b9411e0f2f7bf6501e9ff331f10cb66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pxgreeks.sty) texlive-pxgreeks"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(pxfonts.sty) texlive texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
