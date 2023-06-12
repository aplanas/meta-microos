SUMMARY = "Microsoft Azure Stream Analytics Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Stream Analytics Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python311-azure-mgmt-streamanalytics-1.0.0.0-1.7.noarch.rpm"
RPM_HASH = "20eb3f9c04d136ded30b7f0a8ab9032a03492bafef1b500616e19c293d8fbda40d7b2409bfd04eac1935a7ba2d2962151bff43a38e87c57642a5f029fc0ba742"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(azure-mgmt-streamanalytics) \
python311-azure-mgmt-streamanalytics \
python3dist(azure-mgmt-streamanalytics)"
RDEPENDS:${PN} += "python(abi) \
python311-azure-common \
python311-azure-mgmt-core \
python311-azure-mgmt-nspkg \
python311-azure-nspkg \
python311-msrest"

inherit rpm
