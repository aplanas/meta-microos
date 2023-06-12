SUMMARY = "File support for setuptools declarative setup.cfg"
DESCRIPTION = "File support for setuptools declarative setup.cfg."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python310-setuptools-declarative-requirements-1.2.0-2.1.noarch.rpm"
RPM_HASH = "5b7e5dabbf8771557372b8ffdd6f8d23841ebb33cbe9e515643e9265b4fcfda262993052db5de284a421893d24daa211e1aa79b35fd357e1f87b6cd730e6900a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-declarative-requirements \
python3.10dist(setuptools-declarative-requirements) \
python310-setuptools-declarative-requirements \
python3dist(setuptools-declarative-requirements)"
RDEPENDS:${PN} += "python(abi) \
python310-setuptools \
python310-toml \
python310-wheel"

inherit rpm
