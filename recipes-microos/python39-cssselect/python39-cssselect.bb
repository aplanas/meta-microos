SUMMARY = "CSS3 selectors for Python"
DESCRIPTION = "cssselect parses CSS3 Selectors and translates them to XPath 1.0 \
expressions. Such expressions can be used in lxml or another XPath engine to \
find the matching elements in an XML or HTML document. \
 \
This module used to live inside of lxml as lxml.cssselect before it was \
extracted as a stand-alone project."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "python39-cssselect-1.2.0-2.1.noarch.rpm"
RPM_HASH = "5d1e677f03b68e8ccbb5cccc7bc6ab7b504b26b7ed654b0c4e317767c3fc2d2f2c26a21f14d047f1c4b7ccad7863c44661508cebb0d757e691fa638a5285dd63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cssselect) python39-cssselect python3dist(cssselect)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
