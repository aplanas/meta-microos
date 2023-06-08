SUMMARY = "Apiron helps you cook a tasty client for RESTful APIs"
DESCRIPTION = "Gathering data from multiple services has become a ubiquitous task for web application developers. The complexity can grow quickly: calling an API endpoint with multiple parameter sets, calling multiple API endpoints, calling multiple endpoints in multiple APIs. While the business logic can get hairy, the code to interact with those APIs doesn't have to. \
 \
apiron provides declarative, structured configuration of services and endpoints with a unified interface for interacting with them."
LICENSE = "MIT"

PV = "7.0.0"

RPM_NAME = "python310-apiron-7.0.0-1.3.noarch.rpm"
RPM_HASH = "1fb57267c59408e5f758ba93b5a2182f2b804453bb3bd01622cb42214d423d1a8a9c5c4108a0c580b20eb10b39762e6c42d4856201a34064a21a5681d9178fd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-apiron python3.10dist(apiron) python310-apiron python3dist(apiron)"
RDEPENDS:${PN} += "python(abi) python310-requests"

inherit rpm
