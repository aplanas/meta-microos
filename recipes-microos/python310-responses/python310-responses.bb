SUMMARY = "A utility library for mocking out the `requests` Python library"
DESCRIPTION = "A utility library for mocking out the requests Python library. \
Check https://github.com/getsentry/responses for more information \
about the library."
LICENSE = "Apache-2.0"

PV = "0.21.0"

RPM_NAME = "python310-responses-0.21.0-4.1.noarch.rpm"
RPM_HASH = "9022c153da8401b6440eba9d567d5abe2065dd0d04d81b8dfe27764b1fbb93a2a7fb9a8e71732b76d965088ddab7a0d9f9d92233dd91eb74194cd8b41eb56461"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-responses python3.10dist(responses) python310-responses python3dist(responses)"
RDEPENDS:${PN} += "python(abi) python310-requests"

inherit rpm
