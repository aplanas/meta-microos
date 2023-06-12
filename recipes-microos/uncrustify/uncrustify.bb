SUMMARY = "Source Code Beautifier for C, C++, C#, ObjectiveC, D"
DESCRIPTION = "Source Code Beautifier for C, C++, C#, ObjectiveC, D, Java, Pawn and VALA. \
 \
Features: \
  * Ident code, aligning on parens, assignments, etc. \
  * Align on '=' and variable definitions. \
  * Align structure initializers. \
  * Align #define stuff. \
  * Align backslash-newline stuff. \
  * Reformat comments (a little bit). \
  * Fix inter-character spacing. \
  * Add or remove parens on return statements. \
  * Add or remove braces on single-statement if/do/while/for statements. \
  * Supports embedded SQL 'EXEC SQL' stuff. \
  * Highly configurable - 454 configurable options as of version 0.60."
LICENSE = "GPL-2.0-or-later"

PV = "0.77.1"

RPM_NAME = "uncrustify-0.77.1-1.1.aarch64.rpm"
RPM_HASH = "26e6bf883493fddc9bce26cf44965b709838cfd687fb51c48abf4e2a93a364401b1e02eb11dfb2206048792ee4109c5afb5042160e9372802d1ad8095380f0be"

RPROVIDES:${PN} += "uncrustify uncrustify(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
