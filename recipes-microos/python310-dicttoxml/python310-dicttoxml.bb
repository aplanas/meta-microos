SUMMARY = "Python module for converting a dictionary to XML"
DESCRIPTION = "This module converts a Python dictionary or other native data type \
into a valid XML string."
LICENSE = "GPL-2.0-only"

PV = "1.7.16"

RPM_NAME = "python310-dicttoxml-1.7.16-1.3.noarch.rpm"
RPM_HASH = "8f3f6e7f8826b476922aa20be5430113e7167aa6657479331ef3cf9962c5a911ab94b0dbdd4224ef197149988223ea338a326b7753f6e577a4429ce21ea269b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dicttoxml python3.10dist(dicttoxml) python310-dicttoxml python3dist(dicttoxml)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
