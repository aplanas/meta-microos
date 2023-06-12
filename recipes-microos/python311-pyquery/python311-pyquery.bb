SUMMARY = "A jQuery-like library for python"
DESCRIPTION = "Pyquery allows you to make jQuery queries on XML documents. The API is \
as much as possible the similar to jQuery. Pyquery uses lxml for fast \
XML and HTML manipulation."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "python311-pyquery-2.0.0-3.1.noarch.rpm"
RPM_HASH = "226d13375a2ed1b115c497e03a806f4fcdd0d209f9b01b3db26c4517379525c0861789cbfd4a316f73ba174d96c5fedc856b2743b57700d47e1c356d880cd5d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyquery) \
python311-pyquery \
python3dist(pyquery)"
RDEPENDS:${PN} += "python(abi) \
python311-cssselect \
python311-lxml"

inherit rpm
