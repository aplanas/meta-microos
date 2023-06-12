SUMMARY = "A toolset to deeply merge python dictionaries"
DESCRIPTION = "Python module to deeply merge python dictionaries."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-deepmerge-1.1.0-1.1.noarch.rpm"
RPM_HASH = "9baa0b6f1cb2f5a378404eb20ec847c02b8c8d547dab2dcec0812cc58c181ef65de1e74206baae30b5a8b4c3fc064140d864486f6d38260e38764a025b96ad8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(deepmerge) python39-deepmerge python3dist(deepmerge)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
