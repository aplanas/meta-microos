SUMMARY = "Microsoft Azure Qumulo Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Qumulo Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python310-azure-mgmt-qumulo-1.0.0-1.1.noarch.rpm"
RPM_HASH = "e7b14a8bf27421b21bf1c883606915319077cd720801bf2fde2af870171e7bd46eec54841cfa7c27685ca9b2c80a299e91be62ad754ef3a085106754f32f616e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-mgmt-qumulo \
python3.10dist(azure-mgmt-qumulo) \
python310-azure-mgmt-qumulo \
python3dist(azure-mgmt-qumulo)"
RDEPENDS:${PN} += "(python310-typing_extensions >= 4.3.0 if python310-base < 3.8) \
python(abi) \
python310-azure-common \
python310-azure-mgmt-core \
python310-azure-mgmt-nspkg \
python310-azure-nspkg \
python310-isodate"

inherit rpm
