SUMMARY = "Python module for converting a dictionary to XML"
DESCRIPTION = "This module converts a Python dictionary or other native data type \
into a valid XML string."
LICENSE = "GPL-2.0-only"

PV = "1.7.16"

RPM_NAME = "python311-dicttoxml-1.7.16-1.3.noarch.rpm"
RPM_HASH = "5d3c1c0c27cd4cb648c98f9459a501958c5637ba0431a9528c2ded3c3bcf99c0977c214f5dcf19182cc224f1abec78226290e1940c843e85bef4210368bd1d70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dicttoxml) python311-dicttoxml python3dist(dicttoxml)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
