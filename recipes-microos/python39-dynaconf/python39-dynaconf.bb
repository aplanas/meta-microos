SUMMARY = "The dynamic configurator for your Python Project"
DESCRIPTION = "The dynamic configurator for your Python Project"
LICENSE = "MIT"

PV = "3.1.11"

RPM_NAME = "python39-dynaconf-3.1.11-1.4.noarch.rpm"
RPM_HASH = "065a050058384dda80df3ecc696081575e10f3c91f38d99538ca3c5c0bbbc2a6bf06d9e44a6fd27e32e153f20e32ff529f1702954a59cede05f9ed8942c59ab3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(dynaconf) python39-dynaconf python3dist(dynaconf)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-PyYAML python39-click python39-configobj python39-hvac python39-python-box python39-python-dotenv python39-redis python39-setuptools python39-toml update-alternatives"

inherit rpm
