SUMMARY = "Python dependency management and packaging"
DESCRIPTION = "Python dependency management and packaging made easy."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python39-poetry-1.4.2-3.1.noarch.rpm"
RPM_HASH = "332263ff03dbc9abfdabea3df7dd02cd92e3a863acab7e6cccee6a0646a65022a002171813f1c5eb09aa72d40da1e4057a78f1ee0b2e6013ffc6316062784a65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(poetry) python39-poetry python3dist(poetry)"
RDEPENDS:${PN} += "(python39-requests-toolbelt >= 0.9.1 with python39-requests-toolbelt < 2) (python39-tomlkit >= 0.11.4 with python39-tomlkit < 1.0) /bin/sh /usr/bin/python3.9 python(abi) python39-CacheControl python39-build python39-cachy python39-cleo python39-crashtest python39-dulwich python39-filelock python39-html5lib python39-importlib-metadata python39-installer python39-jsonschema python39-keyring python39-lockfile python39-packaging python39-pexpect python39-pkginfo python39-platformdirs python39-poetry-core python39-poetry-plugin-export python39-pyproject-hooks python39-requests python39-shellingham python39-tomli python39-trove-classifiers python39-urllib3 python39-virtualenv update-alternatives"

inherit rpm
