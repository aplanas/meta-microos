SUMMARY = "Nine men's morris game"
DESCRIPTION = "Morris is an implementation of the board game 'Nine Men's Morris'. \
Other names for this game are: Mills, Merrills, Morris, or Mühle in \
German. \
This implementation of Nine Men's Morris supports not only the \
standard game, but also several rule-variants and different board \
layouts. You can play against the computer, or simply use the \
program to present the board, but play against another human \
opponent. The computer opponent learns from previous games and \
tries not to make the same mistake twice. \
 \
Among others, the game plays the following variants: \
  * Lasker variant (moves are also allowed in the set-phase) \
  * the Möbius board (invented by Ingo Althöfer) \
  * the Windmill board \
  * Pentagon and Hexagon boards \
  * Morabaraba \
  * Six and Seven Men's Morris \
  * Tapatan, Achi, Nine Holes \
 \
Furthermore, the game supports: \
  * advanced AI controls to tweak AI playing style \
  * giving hints for good moves \
  * showing the principal variation \
  * move takeback (undo and redo) \
  * internationalization (English, German, Chinese) \
  * many board and rule variations, as well as free customization \
    of rules \
  * configurable display"
LICENSE = "GPL-3.0-only"

PV = "0.2"

RPM_NAME = "morris-0.2-1.16.aarch64.rpm"
RPM_HASH = "1dbd81a86cb1c5b55222ad745d61fbcc8bcf31b010ca2796cb1c7266e3d6bf3d4601f73c42d8c786dd9418c3944364994e8e3eae70c7d8a96e6544d86c6ca46f"

RPROVIDES:${PN} += "application() application(morris.desktop) morris morris(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgdk-x11-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgthread-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.35)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
