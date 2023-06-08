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

PV = "3.9.16"

RPM_NAME = "python39-base-3.9.16-6.1.aarch64.rpm"
RPM_HASH = "7c9803bd3431dc37137b06408f598ede3eba92ba20a8a22ada0cda007f68d9418ccb785ad0402fc95be0e46e38af6559f7ac8f5a12cdf0b50d8437acb3650f1f"

RPROVIDES:${PN} += "python(abi) python39-asyncio python39-base python39-base(aarch-64) python39-typing python39-xml"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libexpat.so.1()(64bit) libffi.so.8()(64bit) libffi.so.8(LIBFFI_BASE_8.0)(64bit) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libmpdec.so.3()(64bit) libpython3.9.so.1.0()(64bit) libpython3_9-1_0 libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_2.20)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
