SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "2.6.0"

RPM_NAME = "mathjax-winchrome-fonts-2.6.0-3.6.noarch.rpm"
RPM_HASH = "5b47a859d3a089edb4765425694688cd817073121131378e3acf08f8935a1d7d2135a2c83d1f2aaf2cd1bc7ccd42b588591b900979539f245091162a378f2fc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-winchrome-fonts"
RDEPENDS:${PN} += ""

inherit rpm
