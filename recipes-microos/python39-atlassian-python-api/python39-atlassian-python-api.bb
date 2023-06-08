SUMMARY = "Python Atlassian REST API Wrapper"
DESCRIPTION = "Python Atlassian REST API Wrapper"
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "python39-atlassian-python-api-2.0.1-1.11.noarch.rpm"
RPM_HASH = "4ac0e26e95de94d033b6a6ac38f69f04e1d940f7a1d36c5863ba4029f6d80ba9c9b6caa4e20721dbc839b4e96ce94db22080d4052fbb8fd9244302b2ce34f854"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(atlassian-python-api) python39-atlassian-python-api python3dist(atlassian-python-api)"
RDEPENDS:${PN} += "python(abi) python39-kerberos python39-oauthlib python39-requests python39-requests-oauthlib python39-six"

inherit rpm
