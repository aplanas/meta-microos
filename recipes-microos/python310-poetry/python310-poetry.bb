SUMMARY = "Python dependency management and packaging"
DESCRIPTION = "Python dependency management and packaging made easy."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "python310-poetry-1.4.2-3.1.noarch.rpm"
RPM_HASH = "8075dde647ec65c8c5d44c996ae4473625fc042dfd8e4d1ca0f592b93f5ce6d05bcbd14418e9371e1a36bf3943980bafc7de540aacae548cfee35f2387d83a32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-poetry python3.10dist(poetry) python310-poetry python3dist(poetry)"
RDEPENDS:${PN} += "(python310-requests-toolbelt >= 0.9.1 with python310-requests-toolbelt < 2) (python310-tomlkit >= 0.11.4 with python310-tomlkit < 1.0) /bin/sh /usr/bin/python3.10 python(abi) python310-CacheControl python310-build python310-cachy python310-cleo python310-crashtest python310-dulwich python310-filelock python310-html5lib python310-installer python310-jsonschema python310-keyring python310-lockfile python310-packaging python310-pexpect python310-pkginfo python310-platformdirs python310-poetry-core python310-poetry-plugin-export python310-pyproject-hooks python310-requests python310-shellingham python310-tomli python310-trove-classifiers python310-urllib3 python310-virtualenv update-alternatives"

inherit rpm
