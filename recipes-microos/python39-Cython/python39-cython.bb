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

RPM_NAME = "python39-Cython-0.29.35-1.1.aarch64.rpm"
RPM_HASH = "3e84d5aa2ab32b2051f580438bd3d0e78a7053b868e6e262b15160cd3fd8b4c53c0a3735ed4d83a5351e3f3b5a94b3846f0ef8015cbc1c74027833b13d9d7342"

RPROVIDES:${PN} += "python3.9dist(cython) python39-Cython python39-Cython(aarch-64) python3dist(cython)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python39-devel python39-xml update-alternatives"

inherit rpm
