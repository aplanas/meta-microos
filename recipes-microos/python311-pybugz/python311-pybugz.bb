SUMMARY = "Python Bugzilla Interface"
DESCRIPTION = "PyBugz is a python and command line interface to Bugzilla. \
 \
It was conceived as a tool to speed up the workflow for Gentoo Linux \
developers and contributors when dealing with bugs using Bugzilla. By \
avoiding the clunky web interface, the user quickly search, isolate and \
contribute to the project very quickly. Developers alike can easily extract \
attachments and close bugs all from the comfort of the command line."
LICENSE = "GPL-2.0-only"

PV = "0.13"

RPM_NAME = "python311-pybugz-0.13-3.9.noarch.rpm"
RPM_HASH = "66f2b0a5b4f8e3907a52e5f91d8b9f1d288584208fc910467ed4dd2c1144c2703ce84d539024215889b42db078a16e0eed1270e2acd1e1c666ae01ceb8592895"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pybugz) python311-pybugz python3dist(pybugz)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) update-alternatives"

inherit rpm
