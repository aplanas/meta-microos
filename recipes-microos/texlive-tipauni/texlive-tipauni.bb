SUMMARY = "Producing Unicode characters with TIPA commands"
DESCRIPTION = "Package TIPA uses the T3 encoding for producing IPA characters. \
The package is widely used in the field of linguistics, but \
because of the old encoding, the output documents are less \
productive than Unicode-based documents. This package redefines \
most of the TIPA-commands for outputting Unicode characters. \
Users can now use their beloved TIPA shortcuts with the \
benefits of Unicode, i.e. searchability, copy-pasting, changing \
the font and many more. As this package needs the fontspec \
package for loading an IPA font, it needs to be compiled with \
XeLaTeX or LuaLaTeX. This package can also be viewed as an \
ASCII-based input method for producing IPA characters in \
Unicode. It needs the New Computer Modern font for printing IPA \
characters."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.7asvn65817"

RPM_NAME = "texlive-tipauni-2023.201.0.0.7asvn65817-52.1.noarch.rpm"
RPM_HASH = "b21552e775916cb339cafb99f7700d5debba33029e4c1900aad5868a496cd8c27498e5484d3956c61de6f02718cb5fe4246d27d5fc26bf88d46d5da69cfbb778"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tipauni.sty) \
texlive-tipauni"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(expkv-def.sty) \
tex(expkv-opt.sty) \
tex(fontspec.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
