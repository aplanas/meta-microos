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

PV = "3.11.2"

RPM_NAME = "python311-devel-3.11.2-1.6.aarch64.rpm"
RPM_HASH = "98da2389a3a6cff195d4608ac6c9e4d487d4221b9b3b4f20018abcd990e6c1d295b65b0d613247090057d5fa4d00e5b115b77713e0c778b42b1436481e3e507e"

RPROVIDES:${PN} += "pkgconfig(python-3.11) pkgconfig(python-3.11-embed) python311-devel python311-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config /usr/bin/python3.11 python(abi) python311-base"

inherit rpm
