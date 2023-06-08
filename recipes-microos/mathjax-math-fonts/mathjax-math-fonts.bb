SUMMARY = "Fonts used by MathJax to display math in the browser"
DESCRIPTION = "Fonts used by MathJax to display math in the browser."
LICENSE = "OFL-1.1"

PV = "2.6.0"

RPM_NAME = "mathjax-math-fonts-2.6.0-3.6.noarch.rpm"
RPM_HASH = "c6f9d8ffabdbadbcface3499469274f9ddb1cc9293e9b99b1728ccb316e65b6b26d14786c03411b45275ec2c9b8cf915c3a3edb107bbb5a62b043d5daf97f530"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mathjax-math-fonts"
RDEPENDS:${PN} += ""

inherit rpm
