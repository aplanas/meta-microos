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

PV = "3.12.0a7"

RPM_NAME = "python312-base-3.12.0a7-1.2.aarch64.rpm"
RPM_HASH = "06d1a40b5b4a74e99a37f6633f3e061f980fb45d6ddd8d99001ae4881df99930781b710e01e44bec4d4dd0676fcba9ca2515488c4227037f468e1a783cba28bb"

RPROVIDES:${PN} += "python(abi) python312-asyncio python312-base python312-base(aarch-64) python312-typing python312-xml"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libexpat.so.1()(64bit) libffi.so.8()(64bit) libffi.so.8(LIBFFI_BASE_8.0)(64bit) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libmpdec.so.3()(64bit) libpython3.12.so.1.0()(64bit) libpython3_12-1_0 libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libuuid.so.1()(64bit) libuuid.so.1(UUID_2.20)(64bit) libz.so.1()(64bit) libz.so.1(ZLIB_1.2.0)(64bit)"

inherit rpm
