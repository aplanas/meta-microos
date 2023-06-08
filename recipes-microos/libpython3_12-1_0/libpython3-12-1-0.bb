SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.12.0a7"

RPM_NAME = "libpython3_12-1_0-3.12.0a7-1.2.aarch64.rpm"
RPM_HASH = "0ca8395d09645194c8c3cbb05e38ac1ec1cfb3e0bf35ba39a8fc4e75d03231637ce251f1e3694cdf7e0b4c04c90214c885225869f2054ba2f04bc0ff04a83288"

RPROVIDES:${PN} += "libpython3.12.so.1.0()(64bit) libpython3_12-1_0 libpython3_12-1_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) python312-base"

inherit rpm
