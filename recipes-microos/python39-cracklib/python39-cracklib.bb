SUMMARY = "A CPython extension module wrapping the libcrack library"
DESCRIPTION = "This CPython extension provides Python bindings for cracklib. It \
contains a pythonic interface to cracklib's functions and some Python \
convenience functions."
LICENSE = "GPL-2.0+"

PV = "2.9.3"

RPM_NAME = "python39-cracklib-2.9.3-2.29.aarch64.rpm"
RPM_HASH = "7c6dc237a2824848eff9a9c0dfb4f26528d3a285d3b1f59db4ed7ade244d79743e1807205c3713d87fada19d55ab2f8eb1704799066b267eb9ce8a5ca0b95101"

RPROVIDES:${PN} += "python3.9dist(cracklib) python39-cracklib python39-cracklib(aarch-64) python3dist(cracklib)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libcrack.so.2()(64bit) python(abi)"

inherit rpm
