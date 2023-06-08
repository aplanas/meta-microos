SUMMARY = "Include Files and Libraries Mandatory for Building Python Modules"
DESCRIPTION = "The Python programming language's interpreter can be extended with \
dynamically loaded extensions and can be embedded in other programs. \
 \
This package contains header files, a static library, and development \
tools for building Python modules, extending the Python interpreter or \
embedding Python in applications."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-devel-2.7.18-33.1.aarch64.rpm"
RPM_HASH = "3472152c55dbfa71b5997005e3a660634922d60c40cbbaee39044f63bae51721c5182075c2f46394ff019380a37890d8f9c617a55fbbaa0b9b3509e7c557a7c0"

RPROVIDES:${PN} += "pkgconfig(python) pkgconfig(python-2.7) pkgconfig(python2) python-devel python-devel(aarch-64) python-testsuite python2-devel python2-testsuite"
RDEPENDS:${PN} += "/bin/sh /usr/bin/pkg-config /usr/bin/python /usr/bin/python2 /usr/bin/python2.7 glibc-devel python python(abi) python-base"

inherit rpm
