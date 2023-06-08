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

RPM_NAME = "python311-mypy-1.1.1-1.1.noarch.rpm"
RPM_HASH = "4890cd6dac4cfda81df4f8677fe32e6d9f6efd6ddbac3fd69cd0d143cb3b63b0bc41441787621340aa7dade2ddbefb5632dc67f301f4478be5a3e9d8702ddeb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mypy) python311-mypy python3dist(mypy)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 python(abi) python311-mypy_extensions python311-typing_extensions update-alternatives"

inherit rpm
