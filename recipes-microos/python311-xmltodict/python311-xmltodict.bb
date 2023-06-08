SUMMARY = "Module to make XML working resemble JSON"
DESCRIPTION = "xmltodict is a Python module that makes working with XML feel like you are \
working with json, as in this: \
http://www.xml.com/pub/a/2006/05/31/converting-between-xml-and-json.html"
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python311-xmltodict-0.13.0-1.4.noarch.rpm"
RPM_HASH = "3df9055fb0fb6828f9a4bc25a722fb5621975192b7a09ee35591c57847ac1dc3e2ea263010b7a33e72f3c55f9698be17a241725462d4d7ba309136947a5762cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(xmltodict) python311-xmltodict python3dist(xmltodict)"
RDEPENDS:${PN} += "python(abi) python311-xml"

inherit rpm
