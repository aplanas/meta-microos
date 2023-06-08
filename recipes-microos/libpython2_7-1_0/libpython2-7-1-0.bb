SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython2.7 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "libpython2_7-1_0-2.7.18-33.1.aarch64.rpm"
RPM_HASH = "916e24b47b12dc303409b13250159da9c9fe7945caf40a86ebd71f5575eca8329560fdbfff905e41efa4962f83284fd4a6303b22f262a300d204195b66c5ee5d"

RPROVIDES:${PN} += "libpython2.7.so.1.0()(64bit) libpython2_7-1_0 libpython2_7-1_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
