SUMMARY = "Inline (Unit) Tests for OCaml"
DESCRIPTION = "qtest extracts inline unit tests written using a special syntax in \
comments. Those tests are then run using the oUnit framework and the \
qcheck library. The possibilities range from trivial tests \
to sophisticated random generation of test cases."
LICENSE = "GPL-3.0-or-later"

PV = "2.11.2"

RPM_NAME = "ocaml-qtest-2.11.2-2.1.aarch64.rpm"
RPM_HASH = "80ef5c8644ce58e8c9e6fc009f7d8fccbc0cc6cc43f00fa96a29d1671161522e15a7d576b3b9baa71ee86766735028cee19eb26e701e59745ac51a918372b459"

RPROVIDES:${PN} += "ocaml-qtest \
ocaml-qtest(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
