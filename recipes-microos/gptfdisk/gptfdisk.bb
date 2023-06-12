SUMMARY = "GPT partitioning and MBR repair software"
DESCRIPTION = "Partitioning software for GPT disks and to repair MBR disks. The \
gdisk, cgdisk, and sgdisk utilities (in the gdisk package) are \
GPT-enabled partitioning tools; the fixparts utility (in the fixparts \
package) fixes some problems with MBR disks that can be created by \
buggy partitioning software."
LICENSE = "GPL-2.0-only"

PV = "1.0.9"

RPM_NAME = "gptfdisk-1.0.9-3.3.aarch64.rpm"
RPM_HASH = "c8bb3f2b40e37fcef511a2ff77cae0465c7b4ea5fa3d3ff96f073ccc4e4f67fb29a08f0a11c24731fbf10c5cd28cafb5b9786888cf430dd5748e8557e188c36a"

RPROVIDES:${PN} += "gdisk \
gptfdisk \
gptfdisk(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libpopt.so.0()(64bit) \
libpopt.so.0(LIBPOPT_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
