SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.11.3"

RPM_NAME = "libpython3_11-1_0-3.11.3-1.2.aarch64.rpm"
RPM_HASH = "239e61a107bbd99f5c5407508d2e4fb1b3e3873b050161399127a502e12b6170e63d83a69b2506f4f097e68c11d0fba006de4e2f35dad1f8ae778a09470a6da8"

RPROVIDES:${PN} += "libpython3.11.so.1.0()(64bit) libpython3_11-1_0 libpython3_11-1_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) python311-base"

inherit rpm
