SUMMARY = "Python interface to LevelDB"
DESCRIPTION = "Plyvel is a Python interface to LevelDB. \
 \
In addition to basic features like getting, putting and deleting \
data, Plyvel allows you to use write batches, database snapshots, \
very flexible iterators, prefixed databases, bloom filters, custom \
cache sizes, custom comparators."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "python39-plyvel-1.5.0-1.5.aarch64.rpm"
RPM_HASH = "5f8840e4d9d86939e23f6bac3c7b6231bbc4eaaefb75558b39cfbe2f9276b5d52827a81387ef89d58cb692ce5055365b91a72c97bff4c0925377fb3423296e12"

RPROVIDES:${PN} += "python3.9dist(plyvel) \
python39-plyvel \
python39-plyvel(aarch-64) \
python3dist(plyvel)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libleveldb.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
python(abi)"

inherit rpm
