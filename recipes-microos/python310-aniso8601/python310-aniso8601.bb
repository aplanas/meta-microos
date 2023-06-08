SUMMARY = "A library for parsing ISO 8601 strings"
DESCRIPTION = "aniso8601 is a Python library for parsing date strings \
in ISO 8601 format into datetime format."
LICENSE = "BSD-3-Clause"

PV = "9.0.1"

RPM_NAME = "python310-aniso8601-9.0.1-1.10.noarch.rpm"
RPM_HASH = "1ace5e35bf43da929548e5e416fbee26d54db6428b6d81122b8cd2c3438a93e6e452dda358187267f651e34cdc764120265387861d33c99c56963deac44a3a08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aniso8601 python3.10dist(aniso8601) python310-aniso8601 python3dist(aniso8601)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
