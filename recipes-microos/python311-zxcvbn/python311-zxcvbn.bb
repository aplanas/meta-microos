SUMMARY = "Python password strength estimator"
DESCRIPTION = "Python password strength estimator."
LICENSE = "MIT"

PV = "4.4.28"

RPM_NAME = "python311-zxcvbn-4.4.28-1.20.noarch.rpm"
RPM_HASH = "3f13bf3e483eed71cd94a6943f79668f488f5a97200d30650ff51aead90e8d622599bc89d38ca8e2457befb6c760f2fa2a65d3cf5fdc21d6215c72a44878a87f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(zxcvbn) python311-zxcvbn python3dist(zxcvbn)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi)"

inherit rpm
