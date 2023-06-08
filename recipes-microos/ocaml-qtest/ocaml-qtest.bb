SUMMARY = "Inline (Unit) Tests for OCaml"
DESCRIPTION = "qtest extracts inline unit tests written using a special syntax in \
comments. Those tests are then run using the oUnit framework and the \
qcheck library. The possibilities range from trivial tests \
to sophisticated random generation of test cases."
LICENSE = "GPL-3.0-or-later"

PV = "2.11.2"

RPM_NAME = "ocaml-qtest-2.11.2-1.12.aarch64.rpm"
RPM_HASH = "430793aab9f4dafd9529eaaddf403f766c22681e435f2b065c7b0e141edabd107a11841c6de5448484ba71599842f34b9c3f0473fa5d226543a507e8d2e6e8d5"

RPROVIDES:${PN} += "ocaml-qtest ocaml-qtest(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit)"

inherit rpm
