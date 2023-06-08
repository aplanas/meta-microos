SUMMARY = "Microsoft Azure Service Fabric Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Fabric Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-azure-mgmt-servicefabric-2.0.0-1.8.noarch.rpm"
RPM_HASH = "f30acf2a5f2010a886ed53eb82201fcb25f590f34924e9ca29d59fff3c2cb894e01263662d6ff46e7aab61ac3209292c323bc6395832b9e13ea03781232966f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-servicefabric python3.10dist(azure-mgmt-servicefabric) python310-azure-mgmt-servicefabric python3dist(azure-mgmt-servicefabric)"
RDEPENDS:${PN} += "python(abi) python310-azure-common python310-azure-mgmt-core python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrest"

inherit rpm
