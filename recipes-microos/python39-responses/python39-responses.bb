SUMMARY = "A utility library for mocking out the `requests` Python library"
DESCRIPTION = "A utility library for mocking out the requests Python library. \
Check https://github.com/getsentry/responses for more information \
about the library."
LICENSE = "Apache-2.0"

PV = "0.21.0"

RPM_NAME = "python39-responses-0.21.0-4.1.noarch.rpm"
RPM_HASH = "ada982aa3f9d1784ee6a4d0844a42635129df6bdd9dbbe923170eeeb1e43c2251d20bb4c242c0dc78ef9188ff25775fdb895aba87ca33c7a88e97fbfa6b067b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(responses) python39-responses python3dist(responses)"
RDEPENDS:${PN} += "python(abi) python39-requests"

inherit rpm
