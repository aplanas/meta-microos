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

PV = "3.12.0a7"

RPM_NAME = "python312-devel-3.12.0a7-1.2.aarch64.rpm"
RPM_HASH = "6ba1f13650b46b7f8e913aba0a24db23de5b222ce57c420418a4696eadf71d165b61d5e4be6d70ae0b9852aa78cd6c78461481a661548ffde5aa0eb4f739891f"

RPROVIDES:${PN} += "pkgconfig(python-3.12) pkgconfig(python-3.12-embed) python312-devel python312-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config /usr/bin/python3.12 python(abi) python312-base"

inherit rpm
