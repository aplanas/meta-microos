SUMMARY = "HTTP traffic mocking and expectations"
DESCRIPTION = "HTTP traffic mocking and expectations."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-pook-1.1.1-1.3.noarch.rpm"
RPM_HASH = "a915f49779998ebc531b523a9b2bc63da896e67bd37abfabf870f93ec3920218c79ccb574491cc8e15856a0d97ed7e8faf0e786c2175dcd4e3691df0e667ad9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pook) python39-pook python3dist(pook)"
RDEPENDS:${PN} += "python(abi) python39-aiohttp python39-furl python39-jsonschema python39-xmltodict"

inherit rpm
