SUMMARY = "Python library for interacting with JIRA via REST APIs"
DESCRIPTION = "This library eases the use of the JIRA REST API from Python."
LICENSE = "BSD-3-Clause"

PV = "3.5.1"

RPM_NAME = "python310-jira-3.5.1-1.1.noarch.rpm"
RPM_HASH = "9e1d332ed2904442c92b5f4041d15d4ef4717979b29505c0696b462caef61586533d9d4d76bd61036c61f766e8219fec14899f84b179cf3973832ca4274361e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jira python3.10dist(jira) python310-jira python3dist(jira)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-defusedxml python310-keyring python310-oauthlib python310-packaging python310-requests python310-requests-oauthlib python310-requests-toolbelt python310-typing_extensions update-alternatives"

inherit rpm
