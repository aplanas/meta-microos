SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "2.6.0"

RPM_NAME = "mathjax-size1-fonts-2.6.0-3.6.noarch.rpm"
RPM_HASH = "0c979fe0e2aec20c9c1e068b4dbc7ad69c7a6a5cd42b341d5ee3f212a731876c1d2ff58ea6d4705bacd122afab6c02c51ee1935ebf99eadb198fff6c6ce10250"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-size1-fonts"
RDEPENDS:${PN} += ""

inherit rpm
