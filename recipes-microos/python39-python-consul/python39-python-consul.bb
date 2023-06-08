SUMMARY = "Python client for https://www.consul.io/"
DESCRIPTION = "Python client for `Consul.io <http://www.consul.io/>`_"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python39-python-consul-1.1.0-2.9.noarch.rpm"
RPM_HASH = "6d7e1c490d01dbb8649ecb76a733ab146d5a332ae4ef61168d504d78cec9e0eff59d9d27ce7b650c7aa1cad61b15fd73ae1ae307bd3e321ed3cb002739cdca93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(python-consul) python39-python-consul python3dist(python-consul)"
RDEPENDS:${PN} += "python(abi) python39-requests python39-six"

inherit rpm
