SUMMARY = "Library to extract data from HTML and XML using XPath and CSS selectors"
DESCRIPTION = "Parsel is a library to extract data from HTML and XML using XPath and CSS \
selectors."
LICENSE = "BSD-3-Clause"

PV = "1.7.0"

RPM_NAME = "python310-parsel-1.7.0-1.3.noarch.rpm"
RPM_HASH = "befa40a9d49203393c4fa98370dae1cba55693199527672bf33bc61abc44932a7244081151b0b012b4c463ed7fe9ee6efd1b34cb1700218208fffdf316e9bd24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-parsel python3.10dist(parsel) python310-parsel python3dist(parsel)"
RDEPENDS:${PN} += "python(abi) python310-cssselect python310-lxml python310-w3lib"

inherit rpm
