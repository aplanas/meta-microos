SUMMARY = "Microsoft Azure DataBox Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure DataBox Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-databox-2.0.0-1.1.noarch.rpm"
RPM_HASH = "26468cc1faf04c24c8dae6124d520abdb32c8ae9d9a62dca17dfb35c669c8c043d55470fa37a968bcc5ae2dc58142ae7bf691b78b19035a8ae8bc412c33532a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-databox python3.10dist(azure-mgmt-databox) python310-azure-mgmt-databox python3dist(azure-mgmt-databox)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
