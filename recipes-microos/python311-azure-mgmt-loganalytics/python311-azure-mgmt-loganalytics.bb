SUMMARY = "Microsoft Azure Log Analytics Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Log Analytics Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "13.0.0b5"

RPM_NAME = "python311-azure-mgmt-loganalytics-13.0.0b5-1.3.noarch.rpm"
RPM_HASH = "036ab22e2197355aa40671b001dd153cc493c26c22636fa62413da857eb9bb9c672ebbcc240ecf5a088810722681288989fe47158ca1e141edba0481ce753cca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-loganalytics) \
python311-azure-mgmt-loganalytics \
python3dist(azure-mgmt-loganalytics)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
