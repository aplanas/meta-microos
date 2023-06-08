SUMMARY = "Key/Value Datastore for Persistent Memory"
DESCRIPTION = "pmemkv is a local/embedded key-value datastore optimized for persistent memory. \
Rather than being tied to a single language or backing implementation, `pmemkv` \
provides different options for language bindings and storage engines."
LICENSE = "BSD-3-Clause"

PV = "1.5.0"

RPM_NAME = "libpmemkv1-1.5.0-1.1.aarch64.rpm"
RPM_HASH = "402951e69d1a4d7259c99a7d65689b46de90c5b90073a9b039c163f7619dfb5893c1ba0666c52436c6e840b0073b101a2eeb1a74225da92a95c906a30aba7478"

RPROVIDES:${PN} += "libpmemkv.so.1()(64bit) libpmemkv.so.1(LIBPMEMKV_1.0)(64bit) libpmemkv1 libpmemkv1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libmemkind.so.0()(64bit) libpmemkv_json_config1 libpmemobj.so.1()(64bit) libpmemobj.so.1(LIBPMEMOBJ_1.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.5)(64bit) libstdc++.so.6(CXXABI_1.3.7)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
