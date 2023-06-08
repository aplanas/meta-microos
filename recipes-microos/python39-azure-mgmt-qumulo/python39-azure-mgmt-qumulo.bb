SUMMARY = "Microsoft Azure Qumulo Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Qumulo Management Client Library. \
 \
This package has been tested with Python 3.7+."
LICENSE = "MIT"

PV = "1.0.0~b1"

RPM_NAME = "python39-azure-mgmt-qumulo-1.0.0~b1-1.1.noarch.rpm"
RPM_HASH = "029b22cab5f188c9f0a4604a8e8afcfdf90226955e2c0333934de19dcaf9b8c5635c8bb2457aaa9a6bdb6d8c669476f1c144fda724b5812806c0798fc37400b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-qumulo) python39-azure-mgmt-qumulo python3dist(azure-mgmt-qumulo)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-isodate"

inherit rpm
