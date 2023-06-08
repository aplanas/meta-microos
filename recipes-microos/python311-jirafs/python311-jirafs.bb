SUMMARY = "Library for editing JIRA issues as local text files"
DESCRIPTION = "This library lets the user stay out of JIRA by letting them edit JIRA \
issues as a collection of text files using an interface inspired by \
`git` and `hg`."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python311-jirafs-2.3.0-2.7.noarch.rpm"
RPM_HASH = "bf6c6f683d7f52cd0d75c74a657f80750736a5d1b58c72d75d2de0bd7d3ab3f5ecb6c28fe055d7bbb8294da6c340ec9aafa2223a18e782b3786a92e57c9df7f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jirafs) python311-jirafs python3dist(jirafs)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 git-core python(abi) python311-Jinja2 python311-PrettyTable python311-blessings python311-environmental-override python311-jira python311-prettytable python311-python-dateutil python311-watchdog update-alternatives"

inherit rpm
