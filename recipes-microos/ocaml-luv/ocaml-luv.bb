SUMMARY = "Binding to libuv cross-platform asynchronous I/O"
DESCRIPTION = "Luv is a binding to libuv, the cross-platform C library that does \
asynchronous I/O in Node.js and runs its main loop. \
 \
Besides asynchronous I/O, libuv also supports multiprocessing and \
multithreading. Multiple event loops can be run in different threads. libuv also \
exposes a lot of other functionality, amounting to a full OS API, and an \
alternative to the standard module Unix."
LICENSE = "MIT"

PV = "0.5.11"

RPM_NAME = "ocaml-luv-0.5.11-1.11.aarch64.rpm"
RPM_HASH = "86c386cd04e4578ab2d1a57f81ce8af80a44719f1e54838398b4e67d3204d22f3ecb818b1b2489c0cdb9ce7c9281448fb86ef790893d9b1e4022b6092e20f67b"

RPROVIDES:${PN} += "ocaml-luv ocaml-luv(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libuv.so.1()(64bit)"

inherit rpm
