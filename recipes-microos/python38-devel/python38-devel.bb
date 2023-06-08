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

PV = "3.8.16"

RPM_NAME = "python38-devel-3.8.16-6.1.aarch64.rpm"
RPM_HASH = "59707278c883d86bc45f346c6bff7b32d860332d11e638a4d940a11e128e4a9f8a5db69d1f53ec259430d5262cdd142560b73b8698cd1a2be75feb5ebbe6ca70"

RPROVIDES:${PN} += "pkgconfig(python-3.8) pkgconfig(python-3.8-embed) python38-devel python38-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config /usr/bin/python3.8 python(abi) python38-base"

inherit rpm
