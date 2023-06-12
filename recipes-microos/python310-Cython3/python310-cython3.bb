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

PV = "3.0.0~b3"

RPM_NAME = "python310-Cython3-3.0.0~b3-1.1.aarch64.rpm"
RPM_HASH = "bcf24f5b24f2dc10d1cb6004f74ecb15dbc470eb9abb8a362a1d736cf3625a5351b8f2a49769ed630c8db48761dbb415246bf3acff6ed4899d8de6571c78ab14"

RPROVIDES:${PN} += "python3-Cython python3-Cython3 python3-cython python3.10dist(cython) python310-Cython python310-Cython3 python310-Cython3(aarch-64) python310-cython python3dist(cython)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.10 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python310-devel update-alternatives"

inherit rpm
