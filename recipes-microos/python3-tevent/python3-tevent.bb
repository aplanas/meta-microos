SUMMARY = "Python3 bindings for the Tevent library"
DESCRIPTION = "This package contains the python bindings for the Tevent library."
LICENSE = "LGPL-3.0-or-later"

PV = "0.14.1"

RPM_NAME = "python3-tevent-0.14.1-2.1.aarch64.rpm"
RPM_HASH = "7904929b9fe2d4eae4bfd39ac8817808f856230b5e46b6f0369c5e5fd6f9d03ffed50ebd7e51a60aaa54dcddfe8b9dbae13ee2b2b0971415a60706994496b3ab"

RPROVIDES:${PN} += "python3-tevent python3-tevent(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libtalloc.so.2()(64bit) libtalloc.so.2(TALLOC_2.0.2)(64bit) libtevent.so.0()(64bit) libtevent.so.0(TEVENT_0.9.9)(64bit) libtevent0 python(abi)"

inherit rpm
