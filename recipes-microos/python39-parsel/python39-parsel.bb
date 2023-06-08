SUMMARY = "Library to extract data from HTML and XML using XPath and CSS selectors"
DESCRIPTION = "Parsel is a library to extract data from HTML and XML using XPath and CSS \
selectors."
LICENSE = "BSD-3-Clause"

PV = "1.7.0"

RPM_NAME = "python39-parsel-1.7.0-1.3.noarch.rpm"
RPM_HASH = "4497d471331239db8b6debbad3b317ce1de42a55c8a4e21756c900d73226e3593f8913a4ef47704668f325e4b4b97a966b9cb419b05e53b8b59d4b9ff3ad6079"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(parsel) python39-parsel python3dist(parsel)"
RDEPENDS:${PN} += "python(abi) python39-cssselect python39-lxml python39-w3lib"

inherit rpm
