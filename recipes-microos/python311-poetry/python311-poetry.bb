SUMMARY = "Python dependency management and packaging"
DESCRIPTION = "Python dependency management and packaging made easy."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python311-poetry-1.5.1-1.1.noarch.rpm"
RPM_HASH = "447b4ae6f61cddbab1ba2eedf2a95f95f0b09260733d1bda09c191698649acf6004b81ba72d2cbbc88ea7366708bdb23a074bb0f942b7169ab8a143fb8f8a3e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(poetry) python311-poetry python3dist(poetry)"
RDEPENDS:${PN} += "(python311-requests-toolbelt >= 0.9.1 with python311-requests-toolbelt < 2) (python311-tomlkit >= 0.11.4 with python311-tomlkit < 1.0) /bin/sh /usr/bin/python3.11 python(abi) python311-CacheControl python311-build python311-cleo python311-crashtest python311-dulwich python311-filelock python311-html5lib python311-installer python311-jsonschema python311-keyring python311-lockfile python311-packaging python311-pexpect python311-pkginfo python311-platformdirs python311-poetry-core python311-poetry-plugin-export python311-pyproject-hooks python311-requests python311-shellingham python311-trove-classifiers python311-urllib3 python311-virtualenv update-alternatives"

inherit rpm
