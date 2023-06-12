SUMMARY = "Modern Implementation of DBM - Shared Library"
DESCRIPTION = "Kyoto Cabinet is a library of routines for managing a database. The database \
is a simple data file containing records, each is a pair of a key and a \
value. Every key and value is serial bytes with variable length. Both binary \
data and character string can be used as a key and a value. Each key \
must be unique within a database. There is neither concept of data tables \
nor data types. Records are organized in hash table or B+ tree. \
 \
Kyoto Cabinet runs very fast. For example, elapsed time to store one \
million records is 0.9 seconds for hash database, and 1.1 seconds for B+ tree \
database. Moreover, the size of database is very small. For example, overhead \
for a record is 16 bytes for hash database, and 4 bytes for B+ tree database. \
Furthermore, scalability of Kyoto Cabinet is great. The database size can be \
up to 8EB (9.22e18 bytes). \
 \
Kyoto Cabinet is written in the C++ language, and provided as API of C++, C, \
Java, Python, Ruby, Perl, and Lua. Kyoto Cabinet is available on platforms \
which have API conforming to C++03 with the TR1 library extensions. \
Kyoto Cabinet is a free software licensed under the GNU General Public License. \
On the other hand, a commercial license is also provided. If you use \
Kyoto Cabinet within a proprietary software, the commercial license is required."
LICENSE = "SUSE-GPL-3.0-with-FLOSS-exception"

PV = "1.2.77"

RPM_NAME = "libkyotocabinet16-1.2.77-3.1.aarch64.rpm"
RPM_HASH = "e447f9bb0cf75ec85d46d9891b08ba204fd28718cc579e48595190953b4960432a4179abf331401511e11c26e820540d03efad29d8a93449e5bf3ed1450beff0"

RPROVIDES:${PN} += "libkyotocabinet libkyotocabinet.so.16()(64bit) libkyotocabinet16 libkyotocabinet16(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libz.so.1()(64bit)"

inherit rpm
