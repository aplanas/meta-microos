SUMMARY = "Microsoft Azure Stream Analytics Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Stream Analytics Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0.0"

RPM_NAME = "python310-azure-mgmt-streamanalytics-1.0.0.0-1.7.noarch.rpm"
RPM_HASH = "ff1cd19178b4a8f7e862921c54407e82dfc8ed0f0a282621afbe0352e230ee0b3715d97a64b3b6fbff7bbbc627154b119463267c34efa4828ab577503ba120ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-streamanalytics \
python3.10dist(azure-mgmt-streamanalytics) \
python310-azure-mgmt-streamanalytics \
python3dist(azure-mgmt-streamanalytics)"
RDEPENDS:${PN} += "python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-msrest"

inherit rpm
