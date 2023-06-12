SUMMARY = "Microsoft Azure MyService Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure MyService Management Client Library. \
 \
This package has been tested with Python 2.7, 3.5, 3.6, 3.7 and 3.8."
LICENSE = "MIT"

PV = "1.0.0b1"

RPM_NAME = "python39-azure-mgmt-regionmove-1.0.0b1-2.11.noarch.rpm"
RPM_HASH = "2e9c1c0c4a31b97a21fe75128f64f9140806a036eced01001dc886ad114f98d305cfeeca4440fe164a306d29e9cc4dd9a768f618434f176e990403eb3fcf6c8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-regionmove) \
python39-azure-mgmt-regionmove \
python3dist(azure-mgmt-regionmove)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-common \
python39-azure-mgmt-nspkg \
python39-azure-nspkg \
python39-msrest \
python39-msrestazure"

inherit rpm
