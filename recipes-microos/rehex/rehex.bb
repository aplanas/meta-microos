SUMMARY = "Reverse Engineers' Hex Editor"
DESCRIPTION = "A hex heditor with a number of features for analysing and annotating \
binary file formats. \
 \
Current features include: \
 \
    Large file support (tested up to 1 TiB) \
    Decoding of integer/floating point value types \
    Disassembly of machine code \
    Highlighting and annotation of ranges of bytes"
LICENSE = "GPL-2.0-only"

PV = "0.5.4"

RPM_NAME = "rehex-0.5.4-1.4.aarch64.rpm"
RPM_HASH = "700e102b4e4eb2b07ea5b314b7313a9406f2c3af0a60ae5fbf50a517703ae9b2d1af90fe716b42ca028d303f3698b20c037e3d3ee473f007735fdd7720e44f03"

RPROVIDES:${PN} += "application() application(rehex.desktop) rehex rehex(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcapstone.so.4()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libjansson.so.4()(64bit) libjansson.so.4(libjansson.so.4)(64bit) liblua5.4.so.5()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.17)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.22)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libunistring.so.5()(64bit) libwx_baseu-suse.so.3.0.5()(64bit) libwx_baseu-suse.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_adv-suse.so.3.0.5()(64bit) libwx_gtk2u_adv-suse.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_aui-suse.so.3.0.5()(64bit) libwx_gtk2u_aui-suse.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_core-suse.so.3.0.5()(64bit) libwx_gtk2u_core-suse.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_html-suse.so.3.0.5()(64bit) libwx_gtk2u_html-suse.so.3.0.5(WXU_3.0)(64bit) libwx_gtk2u_propgrid-suse.so.3.0.5()(64bit) libwx_gtk2u_propgrid-suse.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm
