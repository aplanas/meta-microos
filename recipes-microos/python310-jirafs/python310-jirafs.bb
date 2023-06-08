SUMMARY = "Library for editing JIRA issues as local text files"
DESCRIPTION = "This library lets the user stay out of JIRA by letting them edit JIRA \
issues as a collection of text files using an interface inspired by \
`git` and `hg`."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python310-jirafs-2.3.0-2.7.noarch.rpm"
RPM_HASH = "d4beadad452043e20b62711ab241e4245d767ddefba8c3a4ddd6195c41453be8191f06acbab1cc4abf5a59e4510f18be72c5f59cbdde74bdad263718a82af4c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jirafs python3.10dist(jirafs) python310-jirafs python3dist(jirafs)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 git-core python(abi) python310-Jinja2 python310-PrettyTable python310-blessings python310-environmental-override python310-jira python310-prettytable python310-python-dateutil python310-watchdog update-alternatives"

inherit rpm
