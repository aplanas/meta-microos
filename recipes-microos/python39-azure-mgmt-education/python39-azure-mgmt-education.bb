SUMMARY = "Microsoft Azure Education Management Client Library for Python"
DESCRIPTION = "This is the Microsoft Azure Education Management Client Library. \
 \
This package has been tested with Python 3.6+."
LICENSE = "MIT"

PV = "1.0.0~b2"

RPM_NAME = "python39-azure-mgmt-education-1.0.0~b2-1.3.noarch.rpm"
RPM_HASH = "c04434449808c58e2ba850488ba4a58ee5295ee8f9a6bc9c57e27bb28d631ca3091b047e6c7ce8970347abcf14bbb8a1b499e0ebac9e44608bc7744053405a48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-mgmt-education) python39-azure-mgmt-education python3dist(azure-mgmt-education)"
RDEPENDS:${PN} += "(python39-typing_extensions >= 4.3.0 if python39-base < 3.8) python(abi) python39-azure-common python39-azure-mgmt-core python39-azure-mgmt-nspkg python39-azure-nspkg python39-msrest"

inherit rpm
