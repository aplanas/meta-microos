SUMMARY = "A low-level PDF generator"
DESCRIPTION = "A low-level PDF generator written in Python and based on PDF specification 1.7."
LICENSE = "BSD-3-Clause"

PV = "0.6.0"

RPM_NAME = "python39-pydyf-0.6.0-1.1.noarch.rpm"
RPM_HASH = "4abd8f5b2f3282f1552d98328248d5c328d637f94b4a7a66572e57c01be693abe9858716e052be92101fe3ad2922ca7e014f62c914ecc70fb2a540540b67dc44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pydyf) python39-pydyf python3dist(pydyf)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
