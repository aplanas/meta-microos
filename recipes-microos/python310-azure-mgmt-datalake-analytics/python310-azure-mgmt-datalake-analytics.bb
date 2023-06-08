SUMMARY = "Microsoft Azure Data Lake Analytics Management Client Library"
DESCRIPTION = "This is the Microsoft Azure Data Lake Analytics Management Client Library. \
 \
Azure Resource Manager (ARM) is the next generation of management APIs that \
replace the old Azure Service Management (ASM). \
 \
This package has been tested with Python 2.7, 3.4, 3.5 and 3.6."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python310-azure-mgmt-datalake-analytics-0.6.0-4.11.noarch.rpm"
RPM_HASH = "542f3a7698cf1a92ebc95d1ff67137252394b29a667d0189be5130b745218775aa6b06cb080284ed40bd733e519118d549f4ff912be71608622c72f869c48f04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-datalake-analytics python3.10dist(azure-mgmt-datalake-analytics) python310-azure-mgmt-datalake-analytics python3dist(azure-mgmt-datalake-analytics)"
RDEPENDS:${PN} += "python(abi) python310-azure-common python310-azure-mgmt-datalake-nspkg python310-azure-mgmt-nspkg python310-azure-nspkg python310-msrestazure"

inherit rpm
