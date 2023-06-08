SUMMARY = "Official Dropbox API Client"
DESCRIPTION = "Official Dropbox API Client"
LICENSE = "MIT"

PV = "10.4.1"

RPM_NAME = "python311-dropbox-10.4.1-2.8.noarch.rpm"
RPM_HASH = "fa2ce39d7a9737484093a8a61dc025c6aa6cc78e3634bdbfd0e49bddad49770665f7638c835d8890085177badb2c9ef4adf38ddba3a84cd0703a0bbe1ba36fc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(dropbox) python311-dropbox python3dist(dropbox)"
RDEPENDS:${PN} += "python(abi) python311-requests python311-six"

inherit rpm
