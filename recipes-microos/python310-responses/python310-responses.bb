SUMMARY = "A utility library for mocking out the `requests` Python library"
DESCRIPTION = "A utility library for mocking out the requests Python library. \
Check https://github.com/getsentry/responses for more information \
about the library."
LICENSE = "Apache-2.0"

PV = "0.23.1"

RPM_NAME = "python310-responses-0.23.1-2.1.noarch.rpm"
RPM_HASH = "b7401ec2b8628a06e2c4867e30fe865a610433371ccfe87190f6c6aeddc9c674517157eba6ece500bfa43f2a8f5f6d55304bb4042a0aee8e4d23685568a6fd0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-responses \
python3.10dist(responses) \
python310-responses \
python3dist(responses)"
RDEPENDS:${PN} += "(python310-requests >= 2.22.0 with python310-requests < 3) \
python(abi) \
python310-PyYAML \
python310-urllib3"

inherit rpm
