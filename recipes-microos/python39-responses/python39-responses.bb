SUMMARY = "A utility library for mocking out the `requests` Python library"
DESCRIPTION = "A utility library for mocking out the requests Python library. \
Check https://github.com/getsentry/responses for more information \
about the library."
LICENSE = "Apache-2.0"

PV = "0.23.1"

RPM_NAME = "python39-responses-0.23.1-2.1.noarch.rpm"
RPM_HASH = "d69743fa6448237e1e155c63e1911d18d267973668a2e78026677abf71a3b63813b518896759333b914538124b005c06891584da41630ddf224e3440b6978ff4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(responses) \
python39-responses \
python3dist(responses)"
RDEPENDS:${PN} += "(python39-requests >= 2.22.0 with python39-requests < 3) \
python(abi) \
python39-PyYAML \
python39-urllib3"

inherit rpm
