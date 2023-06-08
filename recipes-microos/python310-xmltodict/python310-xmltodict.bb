SUMMARY = "Module to make XML working resemble JSON"
DESCRIPTION = "xmltodict is a Python module that makes working with XML feel like you are \
working with json, as in this: \
http://www.xml.com/pub/a/2006/05/31/converting-between-xml-and-json.html"
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python310-xmltodict-0.13.0-1.4.noarch.rpm"
RPM_HASH = "c87dfa95f34f00ae74a2272bf7042a680f8d19a9858a9fe2ac92b6955dc2fb5190cbf72a87cc1762cb45917ec5b84d95609570983b73cdbdb16f5833b6a3fd39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xmltodict python3.10dist(xmltodict) python310-xmltodict python3dist(xmltodict)"
RDEPENDS:${PN} += "python(abi) python310-xml"

inherit rpm
