SUMMARY = "wxWidgets quality assurance class library"
DESCRIPTION = "This is the library containing extra classes for quality \
assurance, containing the wxDebugReport class. wxDebugReport is \
used to generate a debug report, containing information about the \
program current state."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_qtu_qa-suse9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "fcfd76bb7a1cd6ad0ba44e2198fb0e241c9ac4c0690979085e81d39862fdf810f723f7a921f705a26a2696fcb5c98028b827c101c2e70b4add6db42f517ec8e6"

RPROVIDES:${PN} += "libwx_qtu_qa-suse.so.9.0.0()(64bit) libwx_qtu_qa-suse.so.9.0.0(WXU_3.2)(64bit) libwx_qtu_qa-suse.so.9.0.0(WXU_3.2.1)(64bit) libwx_qtu_qa-suse.so.9.0.0(WXU_3.2.2)(64bit) libwx_qtu_qa-suse9_0_0 libwx_qtu_qa-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_baseu_xml-suse.so.9.0.0()(64bit) libwx_baseu_xml-suse.so.9.0.0(WXU_3.2)(64bit) libwx_qtu_core-suse.so.9.0.0()(64bit) libwx_qtu_core-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
