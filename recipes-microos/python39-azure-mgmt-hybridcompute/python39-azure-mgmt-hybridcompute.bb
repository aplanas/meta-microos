SUMMARY = "Microsoft Azure Hybrid Compute Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Hybrid Compute Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6 and 3.7."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "python39-azure-mgmt-hybridcompute-8.0.0-1.2.noarch.rpm"
RPM_HASH = "48ab4f5256c0f19c087b8cdb500ee6b82460fed143a3a4dace90c1902a3119f18e0d3acd0b918fbb113b593dd959d5f1f9b9ca6bdf5162a7ff2922db82fa418f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-hybridcompute) \
python39-azure-mgmt-hybridcompute \
python3dist(azure-mgmt-hybridcompute)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) \
python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
