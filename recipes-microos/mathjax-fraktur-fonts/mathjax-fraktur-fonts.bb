SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "2.6.0"

RPM_NAME = "mathjax-fraktur-fonts-2.6.0-3.6.noarch.rpm"
RPM_HASH = "440fa37cb3594b7ada17ec9acfd96783391acb93648e7c6dcb569628212409d29e67a7511f1cec740c7c041cd5bf9787b8e1b0c875004081d084233286ff7e54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-fraktur-fonts"
RDEPENDS:${PN} += ""

inherit rpm
