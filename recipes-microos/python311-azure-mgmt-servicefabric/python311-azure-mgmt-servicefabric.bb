SUMMARY = "Microsoft Azure Service Fabric Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Service Fabric Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-azure-mgmt-servicefabric-2.0.0-1.8.noarch.rpm"
RPM_HASH = "382fe7d56a3a84b92cf0edc50efed1dd511e81a34f0b278271075c0c550305f5d9bee693a37253cbe793472349d64f17d6ce2cf3eb502597556f88482834b478"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-servicefabric) python311-azure-mgmt-servicefabric python3dist(azure-mgmt-servicefabric)"
RDEPENDS:${PN} += "python(abi) python311-azure-common python311-azure-mgmt-core python311-azure-mgmt-nspkg python311-azure-nspkg python311-msrest"

inherit rpm
