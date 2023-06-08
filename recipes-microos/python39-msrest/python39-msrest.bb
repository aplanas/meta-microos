SUMMARY = "AutoRest swagger generator Python client runtime"
DESCRIPTION = "AutoRest swagger generator Python client runtime \
Swagger is a powerful open source framework: http://swagger.io"
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "python39-msrest-0.7.1-1.3.noarch.rpm"
RPM_HASH = "9e844a7b03a4b7becccb0b9372f416de32860c6ff15cba5f77131d5e1d2a1549a5abef58fe1dcc2a851d0e6459db3bdf43cf8a77c0712b050ca63ada89f4ce5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(msrest) python39-msrest python3dist(msrest)"
RDEPENDS:${PN} += "python(abi) python39-azure-core python39-certifi python39-isodate python39-requests python39-requests-oauthlib"

inherit rpm
