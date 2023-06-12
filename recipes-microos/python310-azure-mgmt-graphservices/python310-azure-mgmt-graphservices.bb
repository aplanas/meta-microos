SUMMARY = "Microsoft Azure Graphservices Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Graphservices Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python310-azure-mgmt-graphservices-1.0.0~b1-1.2.noarch.rpm"
RPM_HASH = "17f07ac37c545d520e7cbe95f0735f84e56e26c134b103b29ec704dcaf799e8be88e5af13b3cd3558f527b2e3bfa6e140c4ada3e2c7c3d16fceeac10858bc308"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-graphservices \
python3.10dist(azure-mgmt-graphservices) \
python310-azure-mgmt-graphservices \
python3dist(azure-mgmt-graphservices)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
