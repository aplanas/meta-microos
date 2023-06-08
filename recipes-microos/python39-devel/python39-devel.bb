SUMMARY = "Include Files and Libraries Mandatory for Building Python Modules"
DESCRIPTION = "The Python programming language's interpreter can be extended with \
dynamically loaded extensions and can be embedded in other programs. \
 \
This package contains header files, a static library, and development \
tools for building Python modules, extending the Python interpreter or \
embedding Python in applications. \
 \
This also includes the Python distutils, which were in the Python \
package up to version 2.2.2."
LICENSE = "Python-2.0"

PV = "3.9.16"

RPM_NAME = "python39-devel-3.9.16-6.1.aarch64.rpm"
RPM_HASH = "cc89afec258eb382efac809f66d7f461a003c794e617564b6b7bc354111ff848bb76b871ada106d35b9d8f702ceb6dbf64762a32f313e1dc0803cfcb522a70e6"

RPROVIDES:${PN} += "pkgconfig(python-3.9) pkgconfig(python-3.9-embed) python39-devel python39-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config /usr/bin/python3.9 python(abi) python39-base"

inherit rpm
