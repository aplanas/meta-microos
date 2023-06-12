SUMMARY = "Library for editing JIRA issues as local text files"
DESCRIPTION = "This library lets the user stay out of JIRA by letting them edit JIRA \
issues as a collection of text files using an interface inspired by \
`git` and `hg`."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python311-jirafs-2.3.1-1.1.noarch.rpm"
RPM_HASH = "18decdd7c6d7f447d16245b7de214fe016fbb6227249defe7c6d0c1cb3256ba468e418fa0c02246cb56854b88c1c8cc7d3192307939dcb29b70b1489767e998d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jirafs) \
python311-jirafs \
python3dist(jirafs)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
git-core \
python(abi) \
python311-Jinja2 \
python311-PrettyTable \
python311-blessings \
python311-environmental-override \
python311-jira \
python311-prettytable \
python311-python-dateutil \
python311-watchdog \
update-alternatives"

inherit rpm
