SUMMARY = "JavaScript library to render math in the browser"
DESCRIPTION = "MathJax is an open-source JavaScript display engine for LaTeX, MathML, \
and AsciiMath notation that works in all modern browsers. It requires no \
setup on the part of the user (no plugins to download or software to \
install), so the page author can write web documents that include \
mathematics and be confident that users will be able to view it \
naturally and easily. Supports LaTeX, MathML, and AsciiMath notation \
in HTML pages."
LICENSE = "Apache-2.0"

PV = "2.6.0"

RPM_NAME = "mathjax-2.6.0-3.6.noarch.rpm"
RPM_HASH = "57cae95c890a27d507158b6ce427756aad3f04264aaacc179ba9c8347697aafccb2903c5c5afd0b92d4fb4e99676b19f873da811e86c359dbcdd47079990d81d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax"
RDEPENDS:${PN} += "mathjax-ams-fonts \
mathjax-caligraphic-fonts \
mathjax-fraktur-fonts \
mathjax-main-fonts \
mathjax-math-fonts \
mathjax-sansserif-fonts \
mathjax-script-fonts \
mathjax-size1-fonts \
mathjax-size2-fonts \
mathjax-size3-fonts \
mathjax-size4-fonts \
mathjax-typewriter-fonts \
mathjax-winchrome-fonts \
mathjax-winie6-fonts"

inherit rpm
