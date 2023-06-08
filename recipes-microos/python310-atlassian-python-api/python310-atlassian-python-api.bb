SUMMARY = "Python Atlassian REST API Wrapper"
DESCRIPTION = "Python Atlassian REST API Wrapper"
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "python310-atlassian-python-api-2.0.1-1.11.noarch.rpm"
RPM_HASH = "1f68e2ae82bc2a5cb5ea9d2b2bfd37db87c36851d6746d07e7856ee99b9fa233b3c996a326b4b05770962f157d43652e2f9fe2589661a6c0460c0d1418085faf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-atlassian-python-api python3.10dist(atlassian-python-api) python310-atlassian-python-api python3dist(atlassian-python-api)"
RDEPENDS:${PN} += "python(abi) python310-kerberos python310-oauthlib python310-requests python310-requests-oauthlib python310-six"

inherit rpm
