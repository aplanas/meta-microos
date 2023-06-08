SUMMARY = "The Cython compiler for writing C extensions for the Python language"
DESCRIPTION = "The Cython language allows for writing C extensions for the Python \
language. Cython is a source code translator based on Pyrex, but \
supports more cutting edge functionality and optimizations. \
 \
The Cython language is very close to the Python language (and most Python \
code is also valid Cython code), but Cython additionally supports calling C \
functions and declaring C types on variables and class attributes. This \
allows the compiler to generate very efficient C code from Cython code."
LICENSE = "Apache-2.0"

PV = "0.29.34"

RPM_NAME = "python310-Cython-0.29.34-2.1.aarch64.rpm"
RPM_HASH = "952dd3ecf1b7928d759936415c1ee0ea031f0e1344c433e73915e93a5b494a3034c39c5e76014a2a810dd5c6744005f34376887c7f7a2a1a990da20d4d9a6537"

RPROVIDES:${PN} += "python3-Cython python3.10dist(cython) python310-Cython python310-Cython(aarch-64) python3dist(cython)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python310-devel python310-xml update-alternatives"

inherit rpm
