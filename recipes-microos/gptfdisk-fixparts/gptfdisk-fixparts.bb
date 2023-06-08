SUMMARY = "A tool for repairing certain types of damage to MBR disks"
DESCRIPTION = "A program that corrects errors that can creep into MBR-partitioned \
disks. Removes stray GPT data, fixes mis-sized extended partitions, \
and enables changing primary vs. logical partition status. Also \
provides a few additional partition manipulation features."
LICENSE = "GPL-2.0-only"

PV = "1.0.9"

RPM_NAME = "gptfdisk-fixparts-1.0.9-3.3.aarch64.rpm"
RPM_HASH = "739cf227ea0ef8dbe4ab6ce3ffbc8cd661fc882b5e6e225754fe5100aff9ab08c4ebc05e93fbf9d2ee52d390134db1dfac745ed91618cf9e8d3d35f98639d0d7"

RPROVIDES:${PN} += "gptfdisk-fixparts gptfdisk-fixparts(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
