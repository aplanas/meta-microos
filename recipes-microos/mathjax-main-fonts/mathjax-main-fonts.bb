SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "2.6.0"

RPM_NAME = "mathjax-main-fonts-2.6.0-3.6.noarch.rpm"
RPM_HASH = "816033d286c3b47bc9c5351083a894fe4b6929f617bbb16a7b113ae0888a751fd6f4be25fb5b1aa694b7452e57577b7cf46c633fabce68c1bb50392e45a1a54a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-main-fonts"
RDEPENDS:${PN} += ""

inherit rpm
