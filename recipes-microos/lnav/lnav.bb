SUMMARY = "Logfile Navigator"
DESCRIPTION = "The Logfile Navigator, lnav for short, is a curses-based tool for viewing and \
analyzing log files. The value added by lnav over text viewers or editors is \
that it takes advantage of any semantic information that can be gleaned from \
the log file, such as timestamps and log levels. Using this extra semantic \
information, lnav can do things like interleaving messages from different \
files, generate histograms of messages over time, and provide hotkeys for \
navigating through the file. These features are meant to allow the user to \
quickly and efficiently focus on problems."
LICENSE = "BSD-2-Clause"

PV = "0.11.1"

RPM_NAME = "lnav-0.11.1-2.1.aarch64.rpm"
RPM_HASH = "30e016b70aff636343ced6d37ccad9ed760160d629fbcbaba05605509f0b2aedf16feca87d9ec561f6c2fbde432f57225ca12f457e5ea3ed577c58b99b577e21"

RPROVIDES:${PN} += "application() \
application(lnav.desktop) \
lnav \
lnav(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgcc_s.so.1(GCC_4.5.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libncursesw.so.6()(64bit) \
libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) \
libpcre2-8.so.0()(64bit) \
libreadline.so.8()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.11)(64bit) \
libstdc++.so.6(CXXABI_1.3.13)(64bit) \
libstdc++.so.6(CXXABI_1.3.2)(64bit) \
libstdc++.so.6(CXXABI_1.3.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(CXXABI_1.3.7)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.19)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.22)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.26)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libtinfo.so.6()(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) \
libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit) \
libz.so.1()(64bit) \
libz.so.1(ZLIB_1.2.2)(64bit) \
libz.so.1(ZLIB_1.2.2.4)(64bit)"

inherit rpm
