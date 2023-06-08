SUMMARY = "Experimental type system extensions for programs checked with mypy typechecker"
DESCRIPTION = "The 'mypy_extensions' module defines experimental extensions to the \
standard 'typing' module that are supported by the mypy typechecker."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-mypy_extensions-1.0.0-1.1.noarch.rpm"
RPM_HASH = "5abd12c051a3a11aa093731453d16fa610d7c910634171cdb942767d8585b025d41054752a69ea34099623f5f08b0c9807156998085eef813152f46533e42fb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(mypy-extensions) python311-mypy_extensions python3dist(mypy-extensions)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
