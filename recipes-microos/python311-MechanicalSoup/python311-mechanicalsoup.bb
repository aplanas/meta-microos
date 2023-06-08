SUMMARY = "A Python library for automating interaction with websites"
DESCRIPTION = "A Python library for automating interaction with websites. \
MechanicalSoup automatically stores and sends cookies, \
follows redirects, and can follow links and submit forms. \
It doesn't do Javascript. \
 \
The Mechanize library is incompatible with Python 3 and development \
is inactive. MechanicalSoup provides a similar API to it, built on \
Python giants Requests (for http sessions) and BeautifulSoup (for \
document navigation)."
LICENSE = "MIT"

PV = "1.2.0"

RPM_NAME = "python311-MechanicalSoup-1.2.0-2.2.noarch.rpm"
RPM_HASH = "ad0b4b8d04e8ef9a8c376d41cc61782c14c16f25717cea15e818e9d57f0c099805bf03dca346895325a954710050b6f7f898b9a5895cb7f4cdea614820fd9173"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mechanicalsoup) python311-MechanicalSoup python3dist(mechanicalsoup)"
RDEPENDS:${PN} += "python(abi) python311-beautifulsoup4 python311-lxml python311-requests"

inherit rpm
