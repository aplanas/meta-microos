SUMMARY = "Azure Maps Route Package client library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Maps Services for Route."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python39-azure-maps-route-1.0.0~b1-1.3.noarch.rpm"
RPM_HASH = "7593ad7c78701bf718ebc1c3cccdeb128eeec81779dcfa7147357b888f4e4a344eccc638976f19d5ce632b3bda95065bdb7b52116ad0c69ca68325d6f8f414b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-maps-route) python39-azure-maps-route python3dist(azure-maps-route)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-nspkg python39-msrest python39-requests"

inherit rpm
