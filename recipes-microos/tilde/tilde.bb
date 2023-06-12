SUMMARY = "A text editor for the terminal"
DESCRIPTION = "Tilde is a text editor for the console/terminal, which provides an \
interface for people accustomed to GUI environments such as \
GNOME, KDE and Windows. For example, the short-cut to copy the \
current selection is Control-C, and to paste the previously copied \
text the short-cut Control-V can be used. As another example, the \
File menu can be accessed by pressing Alt-F."
LICENSE = "GPL-3.0-only"

PV = "1.1.3"

RPM_NAME = "tilde-1.1.3-1.5.aarch64.rpm"
RPM_HASH = "ea52a7ed907b2eb965f53dee282107866571717ebfa2b58138ca71d906f2bbb9ceec73a8c9502410b9d9f3e179c93d6619418c442970d194f5cfd9d47a7eb7d0"

RPROVIDES:${PN} += "tilde \
tilde(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.1)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libt3config.so.0()(64bit) \
libt3highlight.so.2()(64bit) \
libt3widget.so.2()(64bit) \
libt3window.so.0()(64bit) \
libtranscript.so.1()(64bit) \
libunistring.so.5()(64bit)"

inherit rpm
