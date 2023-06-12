SUMMARY = "Tool for doing transactional updates using Btrfs snapshots"
DESCRIPTION = "tukit is a simple tool to make changes to a system in an atomic way \
with btrfs and snapshots."
LICENSE = "GPL-2.0-or-later"

PV = "4.2.1"

RPM_NAME = "tukit-4.2.1-1.1.aarch64.rpm"
RPM_HASH = "23010a02e13201a5a56f32c2ae901ba5b642c39883877255b89134c24cfa4e2376c5d7bd88fecc8d40cf7543be8507351c1b2dadd6d994b198513728e227ea26"

RPROVIDES:${PN} += "tukit \
tukit(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
librpm.so.9()(64bit) \
libselinux.so.1()(64bit) \
libselinux.so.1(LIBSELINUX_1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtukit.so.4()(64bit) \
libtukit4"

inherit rpm
