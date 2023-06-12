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

RPM_NAME = "python310-MechanicalSoup-1.2.0-2.2.noarch.rpm"
RPM_HASH = "6d4a4d1d20df93a7d505b318afad7a9936d9552588c8cd4fc179baadd10c9bd5f5cd78d28542ab7139d572aae8beb334930ca8f5294473530de1909bc83014c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-MechanicalSoup \
python3.10dist(mechanicalsoup) \
python310-MechanicalSoup \
python3dist(mechanicalsoup)"
RDEPENDS:${PN} += "python(abi) \
python310-beautifulsoup4 \
python310-lxml \
python310-requests"

inherit rpm
