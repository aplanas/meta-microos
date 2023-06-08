SUMMARY = "A straightforward implementation of DBM"
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
Kyoto Cabinet within a proprietary software, the commercial license is required. \
 \
This package contains the command-line utilities to manage KyotoCabinet \
database files."
LICENSE = "SUSE-GPL-3.0-with-FLOSS-exception"

PV = "1.2.77"

RPM_NAME = "kyotocabinet-1.2.77-2.10.aarch64.rpm"
RPM_HASH = "fb69dbf418d1abadf25b908092a63ffd03a64d4c053d5d459885b30b5ff4c125787131a85c691d96f093c5b7537bc09b7857f46507aec684db71db8e692f4b2e"

RPROVIDES:${PN} += "kyotocabinet kyotocabinet(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libkyotocabinet.so.16()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
