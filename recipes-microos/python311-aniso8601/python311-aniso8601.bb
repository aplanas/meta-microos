SUMMARY = "A library for parsing ISO 8601 strings"
DESCRIPTION = "aniso8601 is a Python library for parsing date strings \
in ISO 8601 format into datetime format."
LICENSE = "BSD-3-Clause"

PV = "9.0.1"

RPM_NAME = "python311-aniso8601-9.0.1-1.10.noarch.rpm"
RPM_HASH = "3c8e9c3e9e5f96369006014b09de56d5bee1319232de4e281d5931da39771ad8d2d18a9b5814e1b1b3a4d44f02aad83c95098c0c36f32bd91592ce65aaef4978"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(aniso8601) python311-aniso8601 python3dist(aniso8601)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
