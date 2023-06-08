SUMMARY = "Python library for interacting with JIRA via REST APIs"
DESCRIPTION = "This library eases the use of the JIRA REST API from Python."
LICENSE = "BSD-3-Clause"

PV = "3.5.0"

RPM_NAME = "python311-jira-3.5.0-1.1.noarch.rpm"
RPM_HASH = "01143a47da2deb3dbf32bdc606276faa33a533d94933cd5f282d936f6216c2d96faf20b0764bd16925432aa47af3eed8b3c19cafbf19dc4445fcfc56f6b786eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jira) python311-jira python3dist(jira)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-defusedxml python311-keyring python311-oauthlib python311-pbr python311-requests python311-requests-oauthlib python311-requests-toolbelt python311-typing_extensions update-alternatives"

inherit rpm
