SUMMARY = "Microsoft Azure Machine Learning Services Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Machine Learning Services Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-mgmt-machinelearningservices-1.0.0-1.10.noarch.rpm"
RPM_HASH = "f2c2950f569e5108c64a26d581d62f3304615d21871633e3d05941cd8a10fdcc88cedf237c5fbc0cbc71182db7be528539409e0f2d48d361353b3a411ff78572"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-machinelearningservices) python39-azure-mgmt-machinelearningservices python3dist(azure-mgmt-machinelearningservices)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
