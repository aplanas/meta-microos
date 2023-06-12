SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.10.11"

RPM_NAME = "libpython3_10-1_0-3.10.11-1.2.aarch64.rpm"
RPM_HASH = "808297333cfd46991d6f0599524df56c67d9793b3df3f9ec109200afc19f6babfe33c9b1918845861aaf962089c5c0853c227944bc8d442dc4917d06fc9fee4a"

RPROVIDES:${PN} += "libpython3.10.so.1.0()(64bit) \
libpython3_10-1_0 \
libpython3_10-1_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
python310-base"

inherit rpm
