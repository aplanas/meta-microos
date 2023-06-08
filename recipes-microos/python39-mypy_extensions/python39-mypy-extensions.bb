SUMMARY = "Experimental type system extensions for programs checked with mypy typechecker"
DESCRIPTION = "The 'mypy_extensions' module defines experimental extensions to the \
standard 'typing' module that are supported by the mypy typechecker."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-mypy_extensions-1.0.0-1.1.noarch.rpm"
RPM_HASH = "18cf62c886e8a9639ee29781d0880e20a4ccf28e7e34c7a78d1861594cbe0a598d6f2f7db1846b503b6831d1a02e57bbec50a79adc04abeec635a9f4a39abccf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mypy-extensions) python39-mypy_extensions python3dist(mypy-extensions)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
