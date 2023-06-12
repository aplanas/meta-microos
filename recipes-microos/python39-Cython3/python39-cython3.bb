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

RPM_NAME = "python39-Cython3-3.0.0~b3-1.1.aarch64.rpm"
RPM_HASH = "632febcd286dd251b2b2fd3d457da9e2ae7a33e6e22abecd95981819d5e3ae60677ad30e5e5e880e6d446d2462f342320a3c465f47be8bcdb86d762177d2c1bd"

RPROVIDES:${PN} += "python3.9dist(cython) python39-Cython python39-Cython3 python39-Cython3(aarch-64) python39-cython python3dist(cython)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python39-devel update-alternatives"

inherit rpm
