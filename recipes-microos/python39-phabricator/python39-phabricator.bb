SUMMARY = "Phabricator API Bindings"
DESCRIPTION = "Phabricator API Bindings"
LICENSE = "Apache-2.0"

PV = "0.9.1"

RPM_NAME = "python39-phabricator-0.9.1-1.3.noarch.rpm"
RPM_HASH = "eaf06c630dc85b9db973d4a70b6fd725e3a82ecce8782f83f684ca273d2a75e524ed19fd550c6ea1d965f5dc10020dc23ba580635f9cf73c3e59b5ce64bca5c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(phabricator) \
python39-phabricator \
python3dist(phabricator)"
RDEPENDS:${PN} += "python(abi) \
python39-requests"

inherit rpm
