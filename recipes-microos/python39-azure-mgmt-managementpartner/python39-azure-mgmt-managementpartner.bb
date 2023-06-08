SUMMARY = "Microsoft Azure ManagementPartner Management Client Library"
DESCRIPTION = "This is the Microsoft Azure ManagementPartner Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python39-azure-mgmt-managementpartner-1.0.0.0-1.8.noarch.rpm"
RPM_HASH = "53781d71fbed283816fa4562955f3894ee39ecff9ddcc47aa46dff3902f1aab69b5a60f7bceccbf1e2250a388ee1a4f1e7ed747d25bfec36212a44a615cbd42f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-managementpartner) python39-azure-mgmt-managementpartner python3dist(azure-mgmt-managementpartner)"
RDEPENDS:${PN} += "python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
