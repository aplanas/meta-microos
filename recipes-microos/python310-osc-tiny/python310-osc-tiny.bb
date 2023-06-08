SUMMARY = "Client API for openSUSE BuildService"
DESCRIPTION = "OSC Tiny provides a minimalistic, transparent and class based client for \
accessing the OpenBuildService API. \
 \
For further details see: \
 \
 * https://osc-tiny.readthedocs.io/en/latest/ \
 * https://openbuildservice.org/ \
 * https://build.opensuse.org/apidocs/index"
LICENSE = "MIT"

PV = "0.7.12"

RPM_NAME = "python310-osc-tiny-0.7.12-1.2.noarch.rpm"
RPM_HASH = "d9364d67cfd34d9d4247be88dbf21c65386ed4890d77ddbc4780ea4e9d142462d6c7bdbf6de3acd297fa49f489193d0465ac010c99f8065da5ee4f468f699b82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-osc-tiny python3.10dist(osc-tiny) python310-osc-tiny python3dist(osc-tiny)"
RDEPENDS:${PN} += "(python310-cached-property if python310-base < 3.8) python(abi) python310-PyYAML python310-lxml python310-python-dateutil python310-pytz python310-requests"

inherit rpm
