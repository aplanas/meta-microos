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

RPM_NAME = "python-base-2.7.18-33.1.aarch64.rpm"
RPM_HASH = "ef2212ff9a2c24480efd2882edc0c7f5c805cc69d2f2ac99ab6b94942ec3c3cb3128e0176e86c53258a9ec74786b30721b1ba9eb5eb218ade0caf211752a4370"

RPROVIDES:${PN} += "python(abi) python-argparse python-base python-base(aarch-64) python-ctypes python2-argparse python2-base rpm_macro(have_python2) rpm_macro(py_compile) rpm_macro(py_incdir) rpm_macro(py_libdir) rpm_macro(py_prefix) rpm_macro(py_requires) rpm_macro(py_sitedir) rpm_macro(python2_package_prefix)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libffi.so.8()(64bit) libffi.so.8(LIBFFI_BASE_8.0)(64bit) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libpython2.7.so.1.0()(64bit) libpython2_7-1_0 libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
