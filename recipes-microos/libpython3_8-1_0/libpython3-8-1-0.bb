SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.8.16"

RPM_NAME = "libpython3_8-1_0-3.8.16-6.1.aarch64.rpm"
RPM_HASH = "424088fac9c560f76c7d00f28db189aebc4ae83bbad7de484ec2e8f3d7b86aad626ebe6157e6378f236cca96f7dd02fc04441eae187e9a084081f2946d2d2759"

RPROVIDES:${PN} += "libpython3.8.so.1.0()(64bit) libpython3_8-1_0 libpython3_8-1_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) python38-base"

inherit rpm
