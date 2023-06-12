SUMMARY = "Python library for interacting with JIRA via REST APIs"
DESCRIPTION = "This library eases the use of the JIRA REST API from Python."
LICENSE = "BSD-3-Clause"

PV = "3.5.1"

RPM_NAME = "python311-jira-3.5.1-1.1.noarch.rpm"
RPM_HASH = "6c25d1529c8a994fd388b760b92b4e221c0e9971738c12a0345e573d7c24b064d82a1616b4b890595b77fe238ff0a07a89f882705f28d201319d98b7192e6f2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jira) python311-jira python3dist(jira)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-defusedxml python311-keyring python311-oauthlib python311-packaging python311-requests python311-requests-oauthlib python311-requests-toolbelt python311-typing_extensions update-alternatives"

inherit rpm
