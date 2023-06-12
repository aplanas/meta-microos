SUMMARY = "Python Interpreter base package"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
(HTML) or python-doc-pdf (PDF) packages. \
 \
This package contains all of stand-alone Python files, minus binary \
modules that would pull in extra dependencies."
LICENSE = "Python-2.0"

PV = "2.7.18"

RPM_NAME = "python-base-2.7.18-34.1.aarch64.rpm"
RPM_HASH = "0d55eb8bb74477d61a69d8903812198ddaf803ae41fb1bd286a17273669ce4d7e1dde584039d501a50db07729b3bd4173ae7bf92d1cdf3b86a34ad40074a1c1b"

RPROVIDES:${PN} += "python(abi) \
python-argparse \
python-base \
python-base(aarch-64) \
python-ctypes \
python2-argparse \
python2-base \
rpm_macro(have_python2) \
rpm_macro(py_compile) \
rpm_macro(py_incdir) \
rpm_macro(py_libdir) \
rpm_macro(py_prefix) \
rpm_macro(py_requires) \
rpm_macro(py_sitedir) \
rpm_macro(python2_package_prefix)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbz2.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libffi.so.8()(64bit) \
libffi.so.8(LIBFFI_BASE_8.0)(64bit) \
libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libpython2.7.so.1.0()(64bit) \
libpython2_7-1_0 \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
