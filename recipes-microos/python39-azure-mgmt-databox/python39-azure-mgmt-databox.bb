SUMMARY = "Microsoft Azure DataBox Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure DataBox Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-azure-mgmt-databox-2.0.0-1.1.noarch.rpm"
RPM_HASH = "64974a97c8f708a963947adb5c7cc1850302f9d6cba2c0a0d02d566d982449e1e300ab7e98792563c416e736966a861f3c8be7dcf850c9f3971017cdc94eea13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-databox) python39-azure-mgmt-databox python3dist(azure-mgmt-databox)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
