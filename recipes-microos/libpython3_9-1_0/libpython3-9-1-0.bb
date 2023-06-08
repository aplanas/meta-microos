SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.9.16"

RPM_NAME = "libpython3_9-1_0-3.9.16-6.1.aarch64.rpm"
RPM_HASH = "061dcd69d1895824aa46942e5ca73b5e4a3e9062db0948371e4af44852437c9bb0a2b3e6c6bbc70a7b95b79d52f55fc6b6ffcf2789209659209aadf56504bc12"

RPROVIDES:${PN} += "libpython3.9.so.1.0()(64bit) libpython3_9-1_0 libpython3_9-1_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) python39-base"

inherit rpm
