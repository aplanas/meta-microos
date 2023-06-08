SUMMARY = "Combinators for binding to C libraries without writing any C"
DESCRIPTION = "ctypes is a library for binding to C libraries using pure OCaml. The primary aim is to make writing C extensions as straightforward as possible. \
 \
The core of ctypes is a set of combinators for describing the structure of C types -- numeric types, arrays, pointers, structs, unions and functions. You can use these combinators to describe the types of the functions that you want to call, then bind directly to those functions -- all without writing or generating any C!"
LICENSE = "ISC"

PV = "0.20.1"

RPM_NAME = "ocaml-ctypes-0.20.1-1.8.aarch64.rpm"
RPM_HASH = "2a1f7cc1e68065e29b361d383708e2f8b24da462eef21d65fec18624884d504238016d5d47c9d9b22a7dbc60eb356ebf88e449614172a2443048bef47f7f8612"

RPROVIDES:${PN} += "ocaml-ctypes ocaml-ctypes(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libffi.so.8()(64bit) libffi.so.8(LIBFFI_BASE_8.0)(64bit) libffi.so.8(LIBFFI_CLOSURE_8.0)(64bit)"

inherit rpm
