SUMMARY = "A module for preparing presentations"
DESCRIPTION = "This ConTeXt module provides an easy-to-use interface for \
creating presentations for use with a digital projector. The \
presentations are not interactive (no buttons, hyperlinks or \
navigational tools such as tables of contents). Graphics may be \
mixed with the text of slides. The module provides several \
predefined styles, designed for academic presentation. Most \
styles are configurable, and it is easy to design new styles."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn63903"

RPM_NAME = "texlive-context-simpleslides-2023.204.svn63903-54.1.noarch.rpm"
RPM_HASH = "b977fd37bcd888152e98589af157446a47ed728ff98e0f10be07f2967e4c9ca0f49eaacd7373b505853497fa94720d815aa343a15e8e9a93671f792c676a925b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(s-simpleslides-BigNumber.tex) \
tex(s-simpleslides-BlackBoard.tex) \
tex(s-simpleslides-BottomSquares.tex) \
tex(s-simpleslides-Boxed.tex) \
tex(s-simpleslides-BoxedTitle.tex) \
tex(s-simpleslides-Ellipse.tex) \
tex(s-simpleslides-Embossed.tex) \
tex(s-simpleslides-Framed.tex) \
tex(s-simpleslides-FramedTitle.tex) \
tex(s-simpleslides-FuzzyFrame.tex) \
tex(s-simpleslides-FuzzyTopic.tex) \
tex(s-simpleslides-HorizontalStripes.tex) \
tex(s-simpleslides-NarrowStripes.tex) \
tex(s-simpleslides-PlainCounter.tex) \
tex(s-simpleslides-RainbowStripe.tex) \
tex(s-simpleslides-Rounded.tex) \
tex(s-simpleslides-Shaded.tex) \
tex(s-simpleslides-SideSquares.tex) \
tex(s-simpleslides-SideToc.tex) \
tex(s-simpleslides-Split.tex) \
tex(s-simpleslides-Sunrise.tex) \
tex(s-simpleslides-Swoosh.tex) \
tex(s-simpleslides-ThickStripes.tex) \
tex(s-simpleslides-default.tex) \
texlive-context-simpleslides"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
