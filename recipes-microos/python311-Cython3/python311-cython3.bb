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

PV = "3.0.0~a11"

RPM_NAME = "python311-Cython3-3.0.0~a11-1.5.aarch64.rpm"
RPM_HASH = "ad72ed4a67695dcc6a7118b83dea8d55018676a1f3aa3ff985907cd0d7294709f2c8af0a723b4b1123fe7a1c4e0e2c2247000c2678bb6e4f01389eded2a20787"

RPROVIDES:${PN} += "python3.11dist(cython) python311-Cython python311-Cython3 python311-Cython3(aarch-64) python311-cython python3dist(cython)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python311-devel update-alternatives"

inherit rpm
