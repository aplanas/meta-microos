SUMMARY = "Bidirectional map implementation for Python"
DESCRIPTION = "Bidirectional map implementation and related functionality."
LICENSE = "MPL-2.0"

PV = "0.22.1"

RPM_NAME = "python311-bidict-0.22.1-1.1.noarch.rpm"
RPM_HASH = "0623080cd3471bd55242f5b5d1af086ef7534a930673e64166f34b5782751d2c61eba9f3a3af571d0372af631d77b0330c8f010c399854ac92f537299ded1e37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(bidict) python311-bidict python3dist(bidict)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
