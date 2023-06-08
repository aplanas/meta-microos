SUMMARY = "Python library for interacting with JIRA via REST APIs"
DESCRIPTION = "This library eases the use of the JIRA REST API from Python."
LICENSE = "BSD-3-Clause"

PV = "3.5.0"

RPM_NAME = "python310-jira-3.5.0-1.1.noarch.rpm"
RPM_HASH = "cbd8e3448ec76f395271094e20238c7e76717a3ba1252b66a84dbff43a20802b3243092d1334cb7df4e24959767157bc50e43f1bde617bb3ad2e536a54f02152"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jira python3.10dist(jira) python310-jira python3dist(jira)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-defusedxml python310-keyring python310-oauthlib python310-pbr python310-requests python310-requests-oauthlib python310-requests-toolbelt python310-typing_extensions update-alternatives"

inherit rpm
