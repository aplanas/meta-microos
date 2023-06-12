SUMMARY = "Engraving Gregorian Chant scores"
DESCRIPTION = "Gregorio is a software application for engraving Gregorian \
Chant scores on a computer. Gregorio's main job is to convert a \
gabc file (simple text representation of a score) into a \
GregorioTeX file, which makes TeX able to create a PDF of your \
score."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.6.0.0svn58331"

RPM_NAME = "texlive-gregoriotex-2023.201.6.0.0svn58331-53.1.noarch.rpm"
RPM_HASH = "4cb2fd0918f882b4043fab3886c178d165b1cc93658d3da4b4d80b10542f78bb9a2af0a401ce3e6c77e5c8477e59a403aacfe7e3c2096618a50127bc5f78a350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(gregorio-vowels.dat) \
tex(gregoriosyms.sty) \
tex(gregoriotex-chars.tex) \
tex(gregoriotex-common.tex) \
tex(gregoriotex-gsp-default.tex) \
tex(gregoriotex-main.tex) \
tex(gregoriotex-nabc.tex) \
tex(gregoriotex-signs.tex) \
tex(gregoriotex-spaces.tex) \
tex(gregoriotex-syllable.tex) \
tex(gregoriotex-symbols.tex) \
tex(gregoriotex.sty) \
tex(gregoriotex.tex) \
texlive-gregoriotex"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(graphicx.sty) \
tex(iftex.sty) \
tex(kvoptions.sty) \
tex(luacolor.sty) \
tex(luamplib.sty) \
tex(luaotfload.sty) \
tex(luatexbase.sty) \
tex(xcolor.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-gregoriotex-bin \
texlive-gregoriotex-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
