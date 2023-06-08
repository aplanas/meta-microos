SUMMARY = "Python docstring style checker"
DESCRIPTION = "pydocstyle is a static analysis tool for checking compliance with \
Python docstring conventions. \
 \
pydocstyle supports most of PEP 257 out of the box, but it should not \
be considered a reference implementation. \
 \
The framework for checking docstring style is flexible, and custom \
checks can be easily added, for example to cover NumPy docstring \
conventions."
LICENSE = "MIT"

PV = "6.3.0"

RPM_NAME = "python39-pydocstyle-6.3.0-1.4.noarch.rpm"
RPM_HASH = "4658caa554ae46f3d85d05d395ed6b324ed7addaf06b1f67c5655f89e9585a36333e62a666633d50b01b98d152717829c8fa70d45f3e72875e0bc79c4d7b638f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pydocstyle) python39-pep257 python39-pydocstyle python3dist(pydocstyle)"
RDEPENDS:${PN} += "(python39-importlib-metadata >= 2 if python39-base < 3.8) (python39-tomli >= 1.2.3 if python39-base < 3.11) /bin/sh /usr/bin/python3.9 python(abi) python39-snowballstemmer update-alternatives"

inherit rpm
