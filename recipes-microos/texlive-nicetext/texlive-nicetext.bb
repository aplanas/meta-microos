SUMMARY = "Minimal markup for simple text (Wikipedia style) and documentation"
DESCRIPTION = "The bundle offers 'minimal' markup syntax for various simple \
kinds of text. The user will typically involve little more than \
is printed, and will still get LaTeX quality. The bundle \
provides four packages: wiki addresses general texts, marked up \
in the simple style used on Wikipedia; niceverb is yet another \
means of documenting LaTeX packages: it offers syntax-aware \
typesetting of meta-variables (macro arguments) and for \
referring to commands (and their syntax) in footnotes, section \
titles etc.; fifinddo aims to parse plain text or (La)TeX files \
using TeX, and to write the results to an external file; the \
package is used by another member of the bundle: makedoc, which \
provides the means to produce typeset documentation direct from \
package files."
LICENSE = "LPPL-1.0"

PV = "2023.201.r0.67svn38914"

RPM_NAME = "texlive-nicetext-2023.201.r0.67svn38914-54.1.noarch.rpm"
RPM_HASH = "31184b2dba6f22c24a7c8d690b6dce39bbffcff8fbce75fd7370447d17e5ed75c8d1ba8a0a0e74553d1a038ed3c9e06b467b021d2757aba9830f891ae6d6287a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(arseneau.tex) \
tex(atari.cfg) \
tex(copyfile.cfg) \
tex(copyfile.tex) \
tex(fddial0g.sty) \
tex(fdtxttex.cfg) \
tex(fdtxttex.tex) \
tex(fifinddo.sty) \
tex(makedoc.cfg) \
tex(makedoc.sty) \
tex(mdoccorr.cfg) \
tex(niceverb.sty) \
tex(substr.tex) \
tex(wiki.sty) \
texlive-nicetext"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(actcodes.sty) \
tex(moreverb.sty) \
tex(stacklet.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
