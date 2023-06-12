SUMMARY = "Python library for interacting with JIRA via REST APIs"
DESCRIPTION = "This library eases the use of the JIRA REST API from Python."
LICENSE = "BSD-3-Clause"

PV = "3.5.1"

RPM_NAME = "python39-jira-3.5.1-1.1.noarch.rpm"
RPM_HASH = "3ab82e8e221c0d6ad5b76f322ab268c1a2eb7784c36e2398db8a382a4672e86345749484991e79e31e79d3f4dfa04f70271b8d458d3dbb1a10fc127701d73007"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jira) python39-jira python3dist(jira)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-defusedxml python39-keyring python39-oauthlib python39-packaging python39-requests python39-requests-oauthlib python39-requests-toolbelt python39-typing_extensions update-alternatives"

inherit rpm
