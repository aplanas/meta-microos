SUMMARY = "Microsoft Azure HDInsight Management Client Library"
DESCRIPTION = "This is the Microsoft Azure HDInsight Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "9.0.0"

RPM_NAME = "python310-azure-mgmt-hdinsight-9.0.0-1.8.noarch.rpm"
RPM_HASH = "241296ac1f25b5143f6dbc151723ff5847a375f741d1b152bab21b5fb82fc1d385dd65518f380506b5e4d0a828c07f4725024c7b00f7d3104db0eb3c53c77a84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-hdinsight \
python3.10dist(azure-mgmt-hdinsight) \
python310-azure-mgmt-hdinsight \
python3dist(azure-mgmt-hdinsight)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
