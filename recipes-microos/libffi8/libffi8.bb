SUMMARY = "Foreign Function Interface Library"
DESCRIPTION = "The libffi library provides a portable, high level programming \
interface to various calling conventions.  This allows a programmer to \
call any function specified by a call interface description at run \
time."
LICENSE = "MIT"

PV = "3.4.4"

RPM_NAME = "libffi8-3.4.4-1.3.aarch64.rpm"
RPM_HASH = "e7e336484e56d3d8a13c832a2fe7fc60f18efb48cb2ed3406e86cb6cf60d37b40704ca611e5f3bcc27c31091254218b9b5dda0c189dcd26c272857872d352a77"

RPROVIDES:${PN} += "libffi.so.8()(64bit) libffi.so.8(LIBFFI_BASE_8.0)(64bit) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit) libffi.so.8(LIBFFI_COMPLEX_8.0)(64bit) libffi.so.8(LIBFFI_GO_CLOSURE_8.0)(64bit) libffi8 libffi8(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.27)(64bit)"

inherit rpm
