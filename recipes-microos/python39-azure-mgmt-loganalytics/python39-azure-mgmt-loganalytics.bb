SUMMARY = "Microsoft Azure Log Analytics Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Log Analytics Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "13.0.0b5"

RPM_NAME = "python39-azure-mgmt-loganalytics-13.0.0b5-1.3.noarch.rpm"
RPM_HASH = "3eb984e6031286af2eccaacca32fbf941200d42d79ac7c51c4a1d858cc816512509467687249a0877a552215dcae4cca65f48ded76913606576afb1f02afa23b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-loganalytics) \
python39-azure-mgmt-loganalytics \
python3dist(azure-mgmt-loganalytics)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-core \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest"

inherit rpm
