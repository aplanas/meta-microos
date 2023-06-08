SUMMARY = "Structured Configuration Library"
DESCRIPTION = "ZConfig is a configuration library intended for general use. It supports a \
hierarchical schema-driven configuration model that allows a schema to specify \
data conversion routines written in Python. ZConfig's model is very different \
from the model supported by the ConfigParser module found in Python's standard \
library, and is more suitable to configuration-intensive applications. \
 \
ZConfig schema are written in an XML-based language and are able to 'import' \
schema components provided by Python packages. Since components are able to \
bind to conversion functions provided by Python code in the package (or \
elsewhere), configuration objects can be arbitrarily complex, with values that \
have been verified against arbitrary constraints. This makes it easy for \
applications to separate configuration support from configuration loading even \
with configuration data being defined and consumed by a wide range of separate \
packages."
LICENSE = "ZPL-2.1"

PV = "3.6.1"

RPM_NAME = "python39-ZConfig-3.6.1-1.3.noarch.rpm"
RPM_HASH = "e1a12b5bbb794beb362a9c4fc8a3585a03dfb4eb2e748636ecc04950f5c7453fdd8881e3a7f303995f074ab2734a85eb24db5831aef38b1441814828f6e38324"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(zconfig) python39-ZConfig python3dist(zconfig)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-setuptools update-alternatives"

inherit rpm
