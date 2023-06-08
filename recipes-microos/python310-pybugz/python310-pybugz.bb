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

RPM_NAME = "python310-pybugz-0.13-3.9.noarch.rpm"
RPM_HASH = "73c5d3b3c1eabb11f253c95f3787dca999c9473602f07af84947cd1509eb65375be8531cae4a5b03793c495db7c60ca90dc71c3cc6bd1c03f4baf3475710b463"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pybugz python3-pybugz python3.10dist(pybugz) python310-pybugz python3dist(pybugz)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) update-alternatives"

inherit rpm
