SUMMARY = "A utility library for mocking out the `requests` Python library"
DESCRIPTION = "A utility library for mocking out the requests Python library. \
Check https://github.com/getsentry/responses for more information \
about the library."
LICENSE = "Apache-2.0"

PV = "0.21.0"

RPM_NAME = "python311-responses-0.21.0-4.1.noarch.rpm"
RPM_HASH = "1fb9b7f1d3e667ad4c80175ad4d2d36785d2267f1afa6bf5d9b7767faf7fc78e8b4cd833d41b32e514bdd329d68f317a89ca3c07d73863c25c698a66a08633b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(responses) python311-responses python3dist(responses)"
RDEPENDS:${PN} += "python(abi) python311-requests"

inherit rpm
