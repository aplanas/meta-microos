SUMMARY = "Remote lookup tables for agate"
DESCRIPTION = "Agate-lookup adds one-line access to lookup tables to agate."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python311-agate-lookup-0.3.1-2.7.noarch.rpm"
RPM_HASH = "9a348368614ebdc4c5bb78a7dd60605b43f24cc3b584a9db36587b1b1769a7bbeef89981d911cbf7ba2f84e03acea7b991f2b103da25157694176db5fe4d354b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(agate-lookup) python311-agate-lookup python3dist(agate-lookup)"
RDEPENDS:${PN} += "python(abi) python311-PyYAML python311-agate python311-requests"

inherit rpm
