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

RPM_NAME = "python311-Cython-0.29.34-2.1.aarch64.rpm"
RPM_HASH = "cbfdb1bdfa2777951bd78399c7e78900ed28f701bab322d7e1dcb378cd6c87ce4c334e3a08f38bb5dbb178182819ce200572069f3799aafafbc2417b574111e1"

RPROVIDES:${PN} += "python3.11dist(cython) python311-Cython python311-Cython(aarch-64) python3dist(cython)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.11 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) python(abi) python311-devel python311-xml update-alternatives"

inherit rpm
