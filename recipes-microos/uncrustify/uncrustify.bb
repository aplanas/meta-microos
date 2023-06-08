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

PV = "0.76.0"

RPM_NAME = "uncrustify-0.76.0-1.3.aarch64.rpm"
RPM_HASH = "8d2233d39e070a99e9f4fa3df33253b9d27b43639c0460311a3407c573ee410420e73029b1c23252f5f423eb4c1f97540653f2d4e1196cea5823c1065d1121d4"

RPROVIDES:${PN} += "uncrustify uncrustify(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
