SUMMARY = "Bugzilla CLI client, XML-RPC binding and VCS plugins"
DESCRIPTION = "Provides a CLI program and Python library for interacting with the \
Bugzilla_ bug tracking system, and plugins for version control \
systems that enable interaction with Bugzilla installations."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.5"

RPM_NAME = "python310-bugzillatools-0.5.5-6.13.noarch.rpm"
RPM_HASH = "a4d8007c017828c83e24432b9de1261f894a3a55c6a519531aefc1ebea862fc82cf5d49dcc6e6cedb63a0d942fb9a43dc0d5f5eaf25e538c3ef0101188a756ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bugzillatools python3.10dist(bugzillatools) python310-bugzillatools python3dist(bugzillatools)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
