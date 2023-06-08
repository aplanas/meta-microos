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

PV = "3.10.10"

RPM_NAME = "python310-devel-3.10.10-2.3.aarch64.rpm"
RPM_HASH = "514d04f94c54e9cb9939fb165ec47652bedd8fcb6794ee5ecfb470e87bfe09439662990de5bae171b494d0944dc43cb72ad5c02dac38cd32435125ca20a44743"

RPROVIDES:${PN} += "libpython3.so()(64bit) pkgconfig(python-3.10) pkgconfig(python-3.10-embed) pkgconfig(python3) pkgconfig(python3-embed) python3-devel python310-devel python310-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config /usr/bin/python3 /usr/bin/python3.10 libc.so.6(GLIBC_2.17)(64bit) libpython3.10.so.1.0()(64bit) python(abi) python310-base"

inherit rpm
