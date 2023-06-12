SUMMARY = "Microsoft Azure Agfood Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Agfood Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python311-azure-mgmt-agfood-1.0.0b1-1.8.noarch.rpm"
RPM_HASH = "bc9a624ecdfc5f0670f52b79d095ced6799541930d0dee1cc7c91822f0c434b907cbe149d5ca63cd64c258333b7ee036a5a61a2f0f35c9b2cd8ef39f60589143"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-agfood) \
python311-azure-mgmt-agfood \
python3dist(azure-mgmt-agfood)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
