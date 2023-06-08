SUMMARY = "Python Atlassian REST API Wrapper"
DESCRIPTION = "Python Atlassian REST API Wrapper"
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "python311-atlassian-python-api-2.0.1-1.11.noarch.rpm"
RPM_HASH = "93dff79d44f034d03450b8716055cc4440446c56f8a5933199578fae6702496266418e08848f04fc8ae73c70a56ea03e5e6954484f2b6b1d67d0e6984dfe0a72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(atlassian-python-api) python311-atlassian-python-api python3dist(atlassian-python-api)"
RDEPENDS:${PN} += "python(abi) python311-kerberos python311-oauthlib python311-requests python311-requests-oauthlib python311-six"

inherit rpm
