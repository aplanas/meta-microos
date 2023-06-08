SUMMARY = "wxWidgets media class library"
DESCRIPTION = "wxMediaCtrl is a class for displaying types of media, such as videos, \
audio files, natively through native codecs."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_qtu_media-suse9_0_0-3.2.2.1-2.1.aarch64.rpm"
RPM_HASH = "bb23183f40d02c45dee7989aac9bb0b1660ad9ee5c871e7cbeda0e58e402d0533317abab2ba9ef6900c8cc16fc8d68d9fb178f5e2b3d010a6ad85967f467c377"

RPROVIDES:${PN} += "libwx_qtu_media-suse.so.9.0.0()(64bit) libwx_qtu_media-suse.so.9.0.0(WXU_3.2)(64bit) libwx_qtu_media-suse.so.9.0.0(WXU_3.2.1)(64bit) libwx_qtu_media-suse.so.9.0.0(WXU_3.2.2)(64bit) libwx_qtu_media-suse9_0_0 libwx_qtu_media-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_qtu_core-suse.so.9.0.0()(64bit) libwx_qtu_core-suse.so.9.0.0(WXU_3.2)(64bit)"

inherit rpm
