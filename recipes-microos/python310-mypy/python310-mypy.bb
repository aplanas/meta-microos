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

RPM_NAME = "python310-mypy-1.1.1-1.1.noarch.rpm"
RPM_HASH = "ad39a4a28bf4cddf55eec9a037543a07cfd2a5ca01cdbd203be9eabbeddfbf2a0923edc12a7a735e1f8e066bef62aab71604afa0cefd06760f5c15af0262b407"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mypy python3-mypy python3.10dist(mypy) python310-mypy python3dist(mypy)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 python(abi) python310-mypy_extensions python310-tomli python310-typing_extensions update-alternatives"

inherit rpm
