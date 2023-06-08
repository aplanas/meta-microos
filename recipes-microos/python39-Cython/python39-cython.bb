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

RPM_NAME = "python39-Cython-0.29.34-2.1.aarch64.rpm"
RPM_HASH = "ea2ed4bae51249023d696f4a3e7c054e219665f83ed31f5993a4fac280bd6b7ac9f2c3a27e5e096f0e3f553bd6f3bb2887b01bc0321446bfe735648a62a552e2"

RPROVIDES:${PN} += "python3.9dist(cython) python39-Cython python39-Cython(aarch-64) python3dist(cython)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python39-devel python39-xml update-alternatives"

inherit rpm
