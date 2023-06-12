SUMMARY = "Plain TeX macros for Physicists"
DESCRIPTION = "TeXsis is a TeX macro package which provides useful features \
for typesetting research papers and related documents. For \
example, it includes support specifically for: Automatic \
numbering of equations, figures, tables and references; \
Simplified control of type sizes, line spacing, footnotes, \
running headlines and footlines, and tables of contents, \
figures and tables; Specialized document formats for research \
papers, preprints and 'e-prints', conference proceedings, \
theses, books, referee reports, letters, and memoranda; \
Simplified means of constructing an index for a book or thesis; \
Easy to use double column formatting; Specialized environments \
for lists, theorems and proofs, centered or non-justified text, \
and listing computer code; Specialized macros for easily \
constructing ruled tables. TeXsis was originally developed for \
physicists, but others may also find it useful. It is \
completely compatible with Plain TeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.18svn45678"

RPM_NAME = "texlive-texsis-2023.201.2.18svn45678-54.1.noarch.rpm"
RPM_HASH = "37e64b1edb92baa5703c33846ad0869e47173d947b41629044a91495709e7e353189ff4f2254d076fc3bb82b3c73eefad4a2621f40a5eb22c731a1e7154510e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(TXSconts.tex) \
tex(TXSdcol.tex) \
tex(TXSenvmt.tex) \
tex(TXSeqns.tex) \
tex(TXSfigs.tex) \
tex(TXSfmts.tex) \
tex(TXSfonts.tex) \
tex(TXShead.tex) \
tex(TXSinit.tex) \
tex(TXSletr.tex) \
tex(TXSmacs.tex) \
tex(TXSmemo.tex) \
tex(TXSprns.tex) \
tex(TXSrefs.tex) \
tex(TXSruled.tex) \
tex(TXSsects.tex) \
tex(TXSsite.tex) \
tex(TXSsymb.tex) \
tex(TXStags.tex) \
tex(TXStitle.tex) \
tex(texsis.tex) \
texlive-texsis"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(language.dat) \
tex(language.dat.lua) \
tex(language.def) \
texlive \
texlive-cm \
texlive-filesystem \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-plain \
texlive-scripts \
texlive-scripts-bin \
texlive-tex \
texlive-texsis-bin"

inherit rpm
