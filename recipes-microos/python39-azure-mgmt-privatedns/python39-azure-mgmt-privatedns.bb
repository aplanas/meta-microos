SUMMARY = "Microsoft Azure DNS Private Zones Client Library"
DESCRIPTION = "This is the Microsoft Azure DNS Private Zones Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-privatedns-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "02eed57c19c4976a12efd1b056c040db2556c585db808935cc08c82a1bc8bf05f897e5a293ebf80e8684898bc91b021931f6ad057ad414e0c6892a05f8ec98d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-privatedns) python39-azure-mgmt-privatedns python3dist(azure-mgmt-privatedns)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
