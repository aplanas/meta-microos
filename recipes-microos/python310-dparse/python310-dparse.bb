SUMMARY = "Python dependency file parser"
DESCRIPTION = "A parser for Python dependency files."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python310-dparse-0.6.2-1.3.noarch.rpm"
RPM_HASH = "2f74a1bc17fce3fe71d59b3603038ef48ebdf2c8b22973d57f10b04e074374fcef24d676f575fdeb005d61cf5fe2cd21946cace1a400e6ad9a285d72ee880996"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dparse python3.10dist(dparse) python310-dparse python3dist(dparse)"
RDEPENDS:${PN} += "python(abi) python310-PyYAML python310-packaging"

inherit rpm
