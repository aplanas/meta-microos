SUMMARY = "Library for editing JIRA issues as local text files"
DESCRIPTION = "This library lets the user stay out of JIRA by letting them edit JIRA \
issues as a collection of text files using an interface inspired by \
`git` and `hg`."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python39-jirafs-2.3.0-2.7.noarch.rpm"
RPM_HASH = "d0ae9b7810066083d3c39796a41381e3e44af5b4556d5722776114fa51ee805837025fa7c50273ef66e42e861d71787801e667fa8df8745036977947353e9bca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(jirafs) python39-jirafs python3dist(jirafs)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 git-core python(abi) python39-Jinja2 python39-PrettyTable python39-blessings python39-environmental-override python39-jira python39-prettytable python39-python-dateutil python39-watchdog update-alternatives"

inherit rpm
