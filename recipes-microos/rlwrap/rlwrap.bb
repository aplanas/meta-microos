SUMMARY = "A Readline Wrapper"
DESCRIPTION = "rlwrap uses the GNU readline library to allow the editing of keyboard \
input for any other command. The input history is remembered across \
invocations, separately for each command;history completion and search \
work as in bash and completion word lists can be specified on the \
command line."
LICENSE = "GPL-2.0-or-later"

PV = "0.46.1"

RPM_NAME = "rlwrap-0.46.1-1.2.aarch64.rpm"
RPM_HASH = "3ecd61f7c0282c4781ef6be59220cea7cbfccd5dc0081a534c963b4ffaee113de4061d8033eb5d23858e724e0964514693937741b1d778aa03f14822c342cade"

RPROVIDES:${PN} += "perl(RlwrapFilter) rlwrap rlwrap(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/perl /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libreadline.so.8()(64bit) libreadline.so.8(READLINE_6.3)(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm
