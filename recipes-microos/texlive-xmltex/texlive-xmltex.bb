SUMMARY = "Support for parsing XML documents"
DESCRIPTION = "The package provides an implementation of a parser for \
documents matching the XML 1.0 and XML Namespace \
Recommendations. In addition to parsing commands are provided \
to attatch TeX typesetting instructions to the various markup \
elemenets as they are encounted. Sample files for typesetting a \
subset of TEI, MathML, are included. Element and Attribute \
names, as well as character data, may use any characters \
allowed in XML, using UTF-8 or a suitable 8-bit encoding."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8svn62145"

RPM_NAME = "texlive-xmltex-2023.201.0.0.8svn62145-52.1.noarch.rpm"
RPM_HASH = "5d42daa1f17ffa0f79fe38164ca75636a9f7e6df39d03d9e592a9fe74c24b91b107725ab05e976022f56ea22231c7b4281b359df23919437bea27ad93a0c29df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xmltex.cfg) \
tex(xmltex.tex) \
texlive-xmltex"
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
texlive-atbegshi \
texlive-atveryend \
texlive-babel \
texlive-cm \
texlive-dehyph \
texlive-everyshi \
texlive-filesystem \
texlive-firstaid \
texlive-hyph-utf8 \
texlive-hyphen-base \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3backend \
texlive-l3kernel \
texlive-l3packages \
texlive-latex \
texlive-latex-fonts \
texlive-latexconfig \
texlive-pdftex \
texlive-scripts \
texlive-scripts-bin \
texlive-tex \
texlive-tex-ini-files \
texlive-unicode-data \
texlive-xmltex-bin \
texlive-xmltexconfig"

inherit rpm
