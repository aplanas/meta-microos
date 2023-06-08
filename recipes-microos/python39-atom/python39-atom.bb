SUMMARY = "Memory efficient Python objects"
DESCRIPTION = "Atom is a framework for creating memory efficient Python objects with \
enhanced features such as dynamic initialization, validation, and \
change notification for object attributes. It provides the default \
model binding behaviour for the Enaml UI framework."
LICENSE = "BSD-3-Clause"

PV = "0.9.1"

RPM_NAME = "python39-atom-0.9.1-1.1.aarch64.rpm"
RPM_HASH = "c861cffd8aee261f1b8c8fda4b6b599e8820faaa568a4cfe1c66aea4f5bd63a096015bf69c03a95497dc9d6e4b73caae2b18f5f10cd36c9963e15ac98eebd1ca"

RPROVIDES:${PN} += "python3.9dist(atom) python39-atom python39-atom(aarch-64) python3dist(atom)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) python(abi)"

inherit rpm
