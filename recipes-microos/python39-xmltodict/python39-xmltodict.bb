SUMMARY = "Module to make XML working resemble JSON"
DESCRIPTION = "xmltodict is a Python module that makes working with XML feel like you are \
working with json, as in this: \
http://www.xml.com/pub/a/2006/05/31/converting-between-xml-and-json.html"
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python39-xmltodict-0.13.0-1.4.noarch.rpm"
RPM_HASH = "6ba5dd36668b7e682383f49142158cb657e9c583d6491872ab2d20c679db8f2c04f751891d24199740c496cca8ad8d82785d13d62ede7927ddbe5ead2f3aba68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(xmltodict) python39-xmltodict python3dist(xmltodict)"
RDEPENDS:${PN} += "python(abi) python39-xml"

inherit rpm
