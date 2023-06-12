SUMMARY = "Perl bindings for marisa"
DESCRIPTION = "Perl bindings for marisa."
LICENSE = "LGPL-2.1-or-later | BSD-2-Clause"

PV = "0.2.6"

RPM_NAME = "perl-marisa-0.2.6-1.21.aarch64.rpm"
RPM_HASH = "5a038f15368745fb4d80c1715d5b22bde8ae5ed504e7e29c5a81a111cc79ef3664db3e0dea022a4f519e9b98ce20998ad313828890281624cbd9ed0b26e1917b"

RPROVIDES:${PN} += "perl(marisa) \
perl(marisa::Agent) \
perl(marisa::Key) \
perl(marisa::Keyset) \
perl(marisa::Query) \
perl(marisa::Trie) \
perl(marisac) \
perl-marisa \
perl-marisa(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
marisa \
perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
