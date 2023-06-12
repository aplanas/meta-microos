SUMMARY = "A font for DANTE's logo"
DESCRIPTION = "The DANTE font for the logo of DANTE (http://www.dante.de), the \
German speaking TeX users group. The font includes only the \
five characters d, a, n, t, and e. dantelogo.sty provides an \
interface for LuaLaTeX/XeLaTeX/pdfLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.03svn38599"

RPM_NAME = "texlive-dantelogo-2023.204.0.0.03svn38599-54.1.noarch.rpm"
RPM_HASH = "671d4e4f019128350869e7f961214b43764c9b9c24285ee0d75b9aa5e8411971439dc6b8dfab1d62f4ae3f29a9c13818d7cd5d88f4f0d954b711042cf0bd8800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(DANTE-Bold--texnansx--base.tfm) \
tex(DANTE-Bold--texnansx.tfm) \
tex(DANTE-Bold--texnansx.vf) \
tex(DANTE-Bold-Italic--texnansx--base.tfm) \
tex(DANTE-Bold-Italic--texnansx.tfm) \
tex(DANTE-Bold-Italic--texnansx.vf) \
tex(DANTE-Bold.tfm) \
tex(DANTE-Italic--texnansx--base.tfm) \
tex(DANTE-Italic--texnansx.tfm) \
tex(DANTE-Italic--texnansx.vf) \
tex(DANTE.tfm) \
tex(OT1DANTE.fd) \
tex(T1DANTE.fd) \
tex(dante.enc) \
tex(dante.map) \
tex(dantelogo.sty) \
texlive-dantelogo"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontenc.sty) \
tex(fontspec.sty) \
tex(iftex.sty) \
tex(updmap.cfg) \
texlive \
texlive-dantelogo-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
