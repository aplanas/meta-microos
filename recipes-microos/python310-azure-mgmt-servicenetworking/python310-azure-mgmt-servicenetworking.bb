SUMMARY = "Microsoft Azure Servicenetworking Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Servicenetworking Management Client Library. \
 \
This package has been tested with Python 2.7, 3.6+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python310-azure-mgmt-servicenetworking-1.0.0~b2-1.1.noarch.rpm"
RPM_HASH = "05abe99f10382488eb10b3197432a7622dea951605bd8cbce0ba99398c093c22c5f749c85d16febe75127d98638013c77f9d9fb513375d3e7f5f683b95226c6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-servicenetworking python3.10dist(azure-mgmt-servicenetworking) python310-azure-mgmt-servicenetworking python3dist(azure-mgmt-servicenetworking)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-isodate"

inherit rpm
