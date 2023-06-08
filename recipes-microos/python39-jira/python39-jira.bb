SUMMARY = "Python library for interacting with JIRA via REST APIs"
DESCRIPTION = "This library eases the use of the JIRA REST API from Python."
LICENSE = "BSD-3-Clause"

PV = "3.5.0"

RPM_NAME = "python39-jira-3.5.0-1.1.noarch.rpm"
RPM_HASH = "2bc3f7683b9ebb30c1c011924fcaade945646cd60bf243eace4e44503af162de1745be2081102672c70db585236e0cffff175605590917505a9bdbfc4103916f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jira) python39-jira python3dist(jira)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-defusedxml python39-keyring python39-oauthlib python39-pbr python39-requests python39-requests-oauthlib python39-requests-toolbelt python39-typing_extensions update-alternatives"

inherit rpm
