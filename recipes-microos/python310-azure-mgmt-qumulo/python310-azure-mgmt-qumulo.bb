SUMMARY = "Microsoft Azure Qumulo Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Qumulo Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python310-azure-mgmt-qumulo-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "66d6f77be5e3d8f2c9b7ddec4f1770b05f46996468bd056fa4bdcf945d704f44ab1059b03d5b10b3e8af060b14a1e2763b14b1d11c8bca8eed8dfbc67be8af16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-qumulo python3.10dist(azure-mgmt-qumulo) python310-azure-mgmt-qumulo python3dist(azure-mgmt-qumulo)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-isodate"

inherit rpm
