SUMMARY = "Declarative DSL for building rich user interfaces in Python"
DESCRIPTION = "Enaml is a programming language and framework for creating \
professional quality user interfaces with minimal effort. \
Enaml combines a domain specific declarative language with \
a constraints based layout system to allow users to easily \
define rich UIs with complex and flexible layouts. Enaml \
applications can be run on any platform which supports \
Python and Qt."
LICENSE = "BSD-3-Clause & LGPL-2.1-only"

PV = "0.16.1"

RPM_NAME = "python310-enaml-0.16.1-1.1.aarch64.rpm"
RPM_HASH = "36f753f93d6b0b9a0bca152bd38ef81f16f082045e6eee37a5b10f4be00128a81a92915a7118ac26922197a9d46dd970cef6a366a720e2ce4454abbec31c53f7"

RPROVIDES:${PN} += "python3-enaml python3.10dist(enaml) python310-enaml python310-enaml(aarch-64) python3dist(enaml)"
RDEPENDS:${PN} += "(python310-qt5 or python310-PyQt6 >= 6.3.1 or python3-pyside2 or python3-pyside6 >= 6.2.3) /bin/sh /usr/bin/python3.10 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) python(abi) python310-QtPy python310-atom python310-bytecode python310-kiwisolver python310-ply update-alternatives"

inherit rpm
