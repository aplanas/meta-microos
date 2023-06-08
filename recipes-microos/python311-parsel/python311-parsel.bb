SUMMARY = "Library to extract data from HTML and XML using XPath and CSS selectors"
DESCRIPTION = "Parsel is a library to extract data from HTML and XML using XPath and CSS \
selectors."
LICENSE = "BSD-3-Clause"

PV = "1.7.0"

RPM_NAME = "python311-parsel-1.7.0-1.3.noarch.rpm"
RPM_HASH = "b005aefc0b0e46a586a028640f26be2838580e4d0c4aa85326709475123a3385ae0975aa720fb08ce3164dc928af24edd327aca006ccbe473d403074b82db226"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(parsel) python311-parsel python3dist(parsel)"
RDEPENDS:${PN} += "python(abi) python311-cssselect python311-lxml python311-w3lib"

inherit rpm
