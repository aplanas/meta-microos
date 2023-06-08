SUMMARY = "Python Interpreter shared library"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains libpython3.2 shared library for embedding in \
other applications."
LICENSE = "Python-2.0"

PV = "3.11.2"

RPM_NAME = "libpython3_11-1_0-3.11.2-1.6.aarch64.rpm"
RPM_HASH = "49cb378acbac2e31cc185710ba1538881a35340a74209e99184354430a162bdc2e9406c9ba5965fb52e45f28349bfbd0aa73e4e34b395b2fe56404d6612a083f"

RPROVIDES:${PN} += "libpython3.11.so.1.0()(64bit) libpython3_11-1_0 libpython3_11-1_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) python311-base"

inherit rpm
