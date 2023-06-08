SUMMARY = "Python library for manipulating URLs (and some URIs) in a more natural way"
DESCRIPTION = "URLObject is a utility class for manipulating URLs. The latest \
incarnation of this library builds upon the ideas of its predecessor, \
but aims for a clearer API, focusing on proper method names over \
operator overrides. It's also being developed from the ground up in a \
test-driven manner, and has full Sphinx documentation."
LICENSE = "SUSE-Public-Domain"

PV = "2.4.3"

RPM_NAME = "python310-URLObject-2.4.3-4.12.noarch.rpm"
RPM_HASH = "bad05ba55dd0f53c1c4e2856d895df5027e3be6fec8e1588e565e698ce6365132fc381522bf96426e230fb7e917a01549135f5217709bca98110c50264388924"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-URLObject python3.10dist(urlobject) python310-URLObject python3dist(urlobject)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
