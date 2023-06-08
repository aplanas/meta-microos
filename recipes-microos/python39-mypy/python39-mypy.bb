SUMMARY = "Optional static typing for Python"
DESCRIPTION = "Mypy is an optional static type checker for Python that aims to \
combine the benefits of both dynamic (or 'duck') typing as well as \
static typing. \
 \
Mypy type checks standard Python programs. It can catch many \
programming errors by analyzing programs without having to run them. \
There is basically no runtime overhead when run using any Python VM. \
Mypy's type system features type inference, gradual typing, generics \
and union types."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "python39-mypy-1.1.1-1.1.noarch.rpm"
RPM_HASH = "04bc745cd02ec9c45606ea9f591e62e9e2c6212f0bfc15d8f9f4fc2bbf7d413226285542135ae0382393051792c261976f31f7771aa0433fc8b85bf8bc8b34e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mypy) python39-mypy python3dist(mypy)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-mypy_extensions python39-tomli python39-typing_extensions update-alternatives"

inherit rpm
