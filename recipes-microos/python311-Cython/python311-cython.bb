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

PV = "0.29.35"

RPM_NAME = "python311-Cython-0.29.35-1.1.aarch64.rpm"
RPM_HASH = "cdb49eb481fec9ba171e223f726a11d22695750cdad8009cee48ea918029c9f67be3496b403a9a47fefc8c1b1b24bb1cbc6beb769048c6568d7ad9c2bd2782bd"

RPROVIDES:${PN} += "python3.11dist(cython) python311-Cython python311-Cython(aarch-64) python3dist(cython)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python311-devel python311-xml update-alternatives"

inherit rpm
