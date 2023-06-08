SUMMARY = "A free HEX editor / disk editor"
DESCRIPTION = "wxHexEditor is a hex editor that is capable of handling very large \
files. It supports files up to 2^64 bytes. It can also act as a \
disk editor. \
Features: \
 * Small footprint on RAM; \
 * Raw Disk Access (on POSIX systems); \
 * Does not create temporary files."
LICENSE = "GPL-2.0-only"

PV = "0.24"

RPM_NAME = "wxhexeditor-0.24-3.14.aarch64.rpm"
RPM_HASH = "ead9be342bea4be915055d9d2b626294f06bc976868ac8901f90682895502efa5c1d1404b93d847a4611e737ebbcc38e4dc12c9829b4ecff4dd21da64c74fe5a"

RPROVIDES:${PN} += "application() application(wxHexEditor.desktop) wxhexeditor wxhexeditor(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgomp.so.1()(64bit) libgomp.so.1(GOMP_1.0)(64bit) libgomp.so.1(GOMP_4.0)(64bit) libgomp.so.1(GOMP_4.5)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libmhash.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libwx_baseu-suse.so.3.0.5()(64bit) libwx_baseu-suse.so.3.0.5(WXU_3.0)(64bit) libwx_baseu_net-suse.so.3.0.5()(64bit) libwx_baseu_net-suse.so.3.0.5(WXU_3.0)(64bit) libwx_baseu_xml-suse.so.3.0.5()(64bit) libwx_baseu_xml-suse.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_adv-suse.so.3.0.5()(64bit) libwx_gtk2u_adv-suse.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_aui-suse.so.3.0.5()(64bit) libwx_gtk2u_aui-suse.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_core-suse.so.3.0.5()(64bit) libwx_gtk2u_core-suse.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm
