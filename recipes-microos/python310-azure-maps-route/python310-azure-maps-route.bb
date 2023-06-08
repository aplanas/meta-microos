SUMMARY = "Azure Maps Route Package client library for Python"
DESCRIPTION = "This package contains a Python SDK for Azure Maps Services for Route."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python310-azure-maps-route-1.0.0~b1-1.3.noarch.rpm"
RPM_HASH = "50369c773968e04f41d9ad5ab708851f6c9071cb91132243750463bca86443c7fde76483420a57229387b885e3d7c6521c054ba547a612d8fbe80469c5822923"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-maps-route python3.10dist(azure-maps-route) python310-azure-maps-route python3dist(azure-maps-route)"
RDEPENDS:${PN} += "python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-nspkg python310-msrest python310-requests"

inherit rpm
