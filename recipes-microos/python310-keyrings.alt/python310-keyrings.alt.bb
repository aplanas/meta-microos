SUMMARY = "Alternate keyring implementations"
DESCRIPTION = "Alternate keyring backend implementations for use with the \
keyring package."
LICENSE = "MIT"

PV = "4.0.2"

RPM_NAME = "python310-keyrings.alt-4.0.2-1.11.noarch.rpm"
RPM_HASH = "11019bf000a6c0a208f7495d1f0ed4d57e2a2b017340f84d76df75c0d3f012afef2525adcb32935e8ebd6f334da42920f7987930d5c464cbe5671b2902874517"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-keyrings.alt python3.10dist(keyrings.alt) python310-keyrings.alt python3dist(keyrings.alt)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
