SUMMARY = "Okta login without API token"
DESCRIPTION = "This modules provides a way for scripts to access resources behind \
an Okta SSO solution, without the need for an API token."
LICENSE = "MIT"

PV = "0.2.2"

RPM_NAME = "python39-oktaloginwrapper-0.2.2-2.8.noarch.rpm"
RPM_HASH = "506d9cf05f498a790356f4e3621f48edae6bd6f9dfae3ceb0aa35bf8fcd6bcde018322117e27125059213897dc5f838b6d59029e6491f5714ac8726c5db4a6bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(oktaloginwrapper) python39-oktaloginwrapper python3dist(oktaloginwrapper)"
RDEPENDS:${PN} += "python(abi) python39-lxml python39-requests"

inherit rpm
