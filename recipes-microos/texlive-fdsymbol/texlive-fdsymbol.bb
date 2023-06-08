SUMMARY = "A maths symbol font"
DESCRIPTION = "FdSymbol is a maths symbol font, designed as a companion to the \
Fedra family by Typotheque, but it might also fit other \
contemporary typefaces."
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.8svn61719"

RPM_NAME = "texlive-fdsymbol-2023.201.0.0.8svn61719-52.1.noarch.rpm"
RPM_HASH = "0b8e37cfda493ccf12d45e633a1e58e6fb56e8b44092b16892f1802fe0e923e664d511721a83c6299531374b1460cc3f1f0b17c717d9f61823933074f7640964"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(FdSymbolA-Bold.tfm) tex(FdSymbolA-Book.tfm) tex(FdSymbolA-Medium.tfm) tex(FdSymbolA-Regular.tfm) tex(FdSymbolB-Bold.tfm) tex(FdSymbolB-Book.tfm) tex(FdSymbolB-Medium.tfm) tex(FdSymbolB-Regular.tfm) tex(FdSymbolC-Bold.tfm) tex(FdSymbolC-Book.tfm) tex(FdSymbolC-Medium.tfm) tex(FdSymbolC-Regular.tfm) tex(FdSymbolD-Bold.tfm) tex(FdSymbolD-Book.tfm) tex(FdSymbolD-Medium.tfm) tex(FdSymbolD-Regular.tfm) tex(FdSymbolE-Bold.tfm) tex(FdSymbolE-Book.tfm) tex(FdSymbolE-Medium.tfm) tex(FdSymbolE-Regular.tfm) tex(FdSymbolF-Bold.tfm) tex(FdSymbolF-Book.tfm) tex(FdSymbolF-Medium.tfm) tex(FdSymbolF-Regular.tfm) tex(fdsymbol-a.enc) tex(fdsymbol-b.enc) tex(fdsymbol-c.enc) tex(fdsymbol-d.enc) tex(fdsymbol-e.enc) tex(fdsymbol-f.enc) tex(fdsymbol.map) tex(fdsymbol.sty) texlive-fdsymbol"
RDEPENDS:${PN} += "/bin/sh coreutils ed findutils grep sed tex(amsmath.sty) tex(textcomp.sty) tex(updmap.cfg) tex(xkeyval.sty) texlive texlive-fdsymbol-fonts texlive-filesystem texlive-kpathsea texlive-kpathsea-bin texlive-scripts texlive-scripts-bin"

inherit rpm
