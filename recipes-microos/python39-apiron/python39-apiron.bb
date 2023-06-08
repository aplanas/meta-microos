SUMMARY = "Apiron helps you cook a tasty client for RESTful APIs"
DESCRIPTION = "Gathering data from multiple services has become a ubiquitous task for web application developers. The complexity can grow quickly: calling an API endpoint with multiple parameter sets, calling multiple API endpoints, calling multiple endpoints in multiple APIs. While the business logic can get hairy, the code to interact with those APIs doesn't have to. \
 \
apiron provides declarative, structured configuration of services and endpoints with a unified interface for interacting with them."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python39-apiron-7.0.0-1.3.noarch.rpm"
RPM_HASH = "6fb24828b782f0ac298a0b6b29b49bc1e8e2d1cb1a497c2ead6837c4dd3bea8800819701ed2fb4a8c21889b0dfeef10a6b50c40e5b61e1aac10094f96f88c1d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(apiron) python39-apiron python3dist(apiron)"
RDEPENDS:${PN} += "python(abi) python39-requests"

inherit rpm
