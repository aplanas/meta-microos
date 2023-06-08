SUMMARY = "Tool for doing transactional updates using Btrfs snapshots"
DESCRIPTION = "tukit is a simple tool to make changes to a system in an atomic way \
with btrfs and snapshots."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.5"

RPM_NAME = "tukit-4.1.5-1.1.aarch64.rpm"
RPM_HASH = "2650bc029cd05a51f2688e2b86bbc36d0a99c866428bca78c46e8da0e3d55b4b60187650e756455c8738fb553cc2244ad3e0cd0c7cdb65181fc4fcc2be9042d0"

RPROVIDES:${PN} += "tukit tukit(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) librpm.so.9()(64bit) libselinux.so.1()(64bit) libselinux.so.1(LIBSELINUX_1.0)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.2)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libtukit.so.4()(64bit) libtukit4"

inherit rpm
