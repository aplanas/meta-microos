SUMMARY = "Main interface to C code and data"
DESCRIPTION = "This extension allows the loading of shared libraries (.DLL or .so), \
calling of C functions and accessing of C data structures in pure PHP, \
without having to have deep knowledge of the Zend extension API, and \
without having to learn a third 'intermediate' language."
LICENSE = "PHP-3.01"

PV = "8.2.5"

RPM_NAME = "php8-ffi-8.2.5-1.1.aarch64.rpm"
RPM_HASH = "40adfb24bd92c6cafabbb8cf55a34f601a1609391b6677e76d18ad14d432cd3c900ec32e0b5004747ff3f4a7b57d5a9eabe4ddc36b3f1bea6172371ea8db8d71"

RPROVIDES:${PN} += "config(php8-ffi) php-ffi php8-ffi php8-ffi(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libffi.so.8()(64bit) libffi.so.8(LIBFFI_BASE_8.0)(64bit) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) php"

inherit rpm
