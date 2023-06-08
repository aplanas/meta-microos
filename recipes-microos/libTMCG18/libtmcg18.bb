SUMMARY = "C++ library for creating secure and fair online card games"
DESCRIPTION = "LibTMCG is a C++ library for creating secure and fair online card \
games. The library contains classes, algorithms, and high-level \
protocols to support an application programmer in writing such \
software. Neither a trusted third party (TTP), i.e. a central game \
server, nor trusted hardware components are necessary. With the \
library, there is no need for an independent referee, because the \
applied protocols provide a basic level of confidentiality and \
fairness by itself. The library is suited for peer-to-peer (P2P) \
environments where no TTP is available. \
 \
It cannot be avoided that malicious players share information about \
their private cards, but the protocols ensure that the shuffle of the \
deck is performed randomly (presumed that at least one player is \
honest) and thus the cards will be distributed uniformly among the \
players. Further, no coalition can learn the private cards of a \
player against his will (except for trivial conclusions). The \
corresponding cryptographic problemis called Mental Poker, and \
LibTMCG provides an implementation of such protocols. \
 \
The implementation relies on cryptographic techniques---the so-called \
zero-knowledge proofs. Using these building blocks, the high-level \
protocols minimize the effect of coalitions and preserve the \
confidentiality of the players' strategy, i.e. the players are not \
required to reveal their cards at the end of the game to show that \
they did not cheat."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.18"

RPM_NAME = "libTMCG18-1.3.18-1.17.aarch64.rpm"
RPM_HASH = "19b7c264ecdd4febf2ea0fa12a9724e19eb44b7bc05945e0c13c15081d14356728ca00067cdc5bc5293127d30d7b1169eddb574fc2be2ba2759f6feb35964b0b"

RPROVIDES:${PN} += "libTMCG.so.18()(64bit) libTMCG18 libTMCG18(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcrypt.so.20()(64bit) libgcrypt.so.20(GCRYPT_1.6)(64bit) libgmp.so.10()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
