SUMMARY = "Pytest plugin for URL based testing"
DESCRIPTION = "pytest plugin for URL based testing."
LICENSE = "MPL-2.0"

PV = "2.0.0"

RPM_NAME = "python311-pytest-base-url-2.0.0-1.9.noarch.rpm"
RPM_HASH = "af6bb9f09b6bd1b7095a0c418909733cbe737de73a98e6faf7b1be377bcfca22468906146605b428987c78ecfddd386098dff54e3ccc42fd0903a6dc4ccfec86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-base-url) python311-pytest-base-url python3dist(pytest-base-url)"
RDEPENDS:${PN} += "python(abi) python311-pytest python311-requests"

inherit rpm
