SUMMARY = "Advanced Python dictionaries with dot notation access"
DESCRIPTION = "Advanced Python dictionaries with dot notation access"
LICENSE = "MIT"

PV = "6.1.0"

RPM_NAME = "python310-python-box-6.1.0-1.3.noarch.rpm"
RPM_HASH = "b70b1492078f5eb4c80c86db6272f86f1eea9ef68298af96cd8861f2ecee7b67663014513af67c1d5b4707d04cf45808d0f978403362fd551b194db7516c021b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-box python3.10dist(python-box) python310-python-box python3dist(python-box)"
RDEPENDS:${PN} += "python(abi) python310-msgpack python310-ruamel.yaml python310-toml"

inherit rpm
