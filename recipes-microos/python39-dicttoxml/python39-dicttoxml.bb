SUMMARY = "Python module for converting a dictionary to XML"
DESCRIPTION = "This module converts a Python dictionary or other native data type \
into a valid XML string."
LICENSE = "GPL-2.0-only"

PV = "1.7.16"

RPM_NAME = "python39-dicttoxml-1.7.16-1.3.noarch.rpm"
RPM_HASH = "f2c321a3c8c39cc547a961c38f798ec3e6e127e386f8aaf5d059441ea43867ce99e2486913727df7ee99ac32381d3e6ddc501249b84c44800a5fb16b12ced470"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dicttoxml) \
python39-dicttoxml \
python3dist(dicttoxml)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
