SUMMARY = "An ncurses-based text-mode interface for git"
DESCRIPTION = "Tig is a git repository browser that additionally can act as a pager \
for output from various git commands. \
 \
When browsing repositories, it uses the underlying git commands to \
present the user with various views, such as summarized revision log \
and showing the commit with the log message, diffstat, and the diff. \
 \
Using it as a pager, it will display input from stdin and colorize it."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.8"

RPM_NAME = "tig-2.5.8-1.2.aarch64.rpm"
RPM_HASH = "ecec609db3310745357d297c0b869e10a43ccdf91f558895fdc9743a373dc3acd336d06b091d72b760c0ed0c11541ec6bc14cd270024b4d10fe23569d41d43fc"

RPROVIDES:${PN} += "config(tig) tig tig(aarch-64)"
RDEPENDS:${PN} += "git-core ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libncursesw.so.6()(64bit) libncursesw.so.6(NCURSESTW6_5.7.20081102)(64bit) libpcre2-8.so.0()(64bit) libpcre2-posix.so.3()(64bit) libreadline.so.8()(64bit) libreadline.so.8(READLINE_6.3)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit) libtinfo.so.6(NCURSES6_TINFO_5.7.20081102)(64bit)"

inherit rpm
