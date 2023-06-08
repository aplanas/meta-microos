SUMMARY = "Compatibility shim for Ansible 2.9 and newer"
DESCRIPTION = "Facilitate working with various versions of Ansible 2.9 and newer."
LICENSE = "MIT"

PV = "3.0.2"

RPM_NAME = "python3-ansible-compat-3.0.2-1.1.noarch.rpm"
RPM_HASH = "dc4a2da3ae8535ea780af79fd6ff76451c9b6bb46c0750ff06ce2d8a9b03440666d7fac1d942cf71da18a40ad4727723385195c3baf255b36fd81fb328c81360"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ansible-compat python3.10dist(ansible-compat) python3dist(ansible-compat)"
RDEPENDS:${PN} += "python(abi) python3-subprocess-tee python3.10dist(ansible-core) python3.10dist(jsonschema) python3.10dist(packaging) python3.10dist(pyyaml) python3.10dist(subprocess-tee)"

inherit rpm
