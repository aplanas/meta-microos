SUMMARY = "Python 3 Interpreter and Stdlib Core"
DESCRIPTION = "Python is an interpreted, object-oriented programming language, and is \
often compared to Tcl, Perl, Scheme, or Java.  You can find an overview \
of Python in the documentation and tutorials included in the python-doc \
package. \
 \
This package contains the interpreter core and most commonly used modules \
from the standard library. This is sufficient for many usecases, but it \
excludes components that depend on external libraries, most notably XML, \
database and UI toolkits support."
LICENSE = "Python-2.0"

PV = "3.10.10"

RPM_NAME = "python310-base-3.10.10-2.3.aarch64.rpm"
RPM_HASH = "779591d9e60db4717c38ea61510649bd6d77255db587e80424b880b0a6930a07a2f7def0ed33279576f376c2ab9abcd70d39b27a2d144574ce26ec96562c586f"

RPROVIDES:${PN} += "python(abi) python3-asyncio python3-base python3-typing python3-xml python310-asyncio python310-base python310-base(aarch-64) python310-typing python310-xml rpm_macro(cpython3_soabi) rpm_macro(have_python3) rpm_macro(py3_compile) rpm_macro(py3_soflags)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libexpat.so.1()(64bit) libffi.so.8()(64bit) libffi.so.8(LIBFFI_BASE_8.0)(64bit) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libmpdec.so.3()(64bit) libpython3.10.so.1.0()(64bit) libpython3_10-1_0 libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_2.20)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
