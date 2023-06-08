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

RPM_NAME = "python39-Cython3-3.0.0~a11-1.5.aarch64.rpm"
RPM_HASH = "470e160edd75d3a5fa89d35922d61e746502ae1f1c8999f221c3e48afc2905195bfd2e903b3ea14d7c4805568eba60197ca36eaaac464c8f6035e0ce0f089d1d"

RPROVIDES:${PN} += "python3.9dist(cython) python39-Cython python39-Cython3 python39-Cython3(aarch-64) python39-cython python3dist(cython)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python39-devel update-alternatives"

inherit rpm
