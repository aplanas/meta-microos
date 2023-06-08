SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.10.10"

RPM_NAME = "libpython3_10-1_0-3.10.10-2.3.aarch64.rpm"
RPM_HASH = "a5be125abdd182e6b047aa82dc8431a3c041721f2e4003875c1c8891e939a873559ce1fb2536cda45569f1a84ece54068ece2046ff857e09ef1daafbfaea3ff9"

RPROVIDES:${PN} += "libpython3.10.so.1.0()(64bit) libpython3_10-1_0 libpython3_10-1_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) python310-base"

inherit rpm
