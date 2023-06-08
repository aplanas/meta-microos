SUMMARY = "Drop-in replacement for Perl threads using fork()"
DESCRIPTION = "The 'forks' pragma allows a developer to use threads without having to have \
a threaded perl, or to even run 5.8.0 or higher. \
 \
Refer to the the threads manpage module for ithreads API documentation. \
Also, use \
 \
    perl -Mforks -e 'print $threads::VERSION' \
 \
to see what version of the threads manpage you should refer to regarding \
supported API features. \
 \
There were a number of goals that I am trying to reach with this \
implementation. \
 \
    Using this module *only* makes sense if you run on a system that has an \
    implementation of the 'fork' function by the Operating System. Windows \
    is currently the only known system on which Perl runs which does *not* \
    have an implementation of 'fork'. Therefore, it *doesn't* make any \
    sense to use this module on a Windows system. And therefore, a check is \
    made during installation barring you from installing on a Windows \
    system."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.36"

RPM_NAME = "perl-forks-0.36-1.25.aarch64.rpm"
RPM_HASH = "5520c0c74470f298f71b573d132c28196dbeb1d64f1fb94e0301135bbd50fa61e6b822594c83cbe678111b79e91606dd2ff49e346a98e573c42f0188e9be9d53"

RPROVIDES:${PN} += "perl(forks) perl(forks::shared) perl(threads::shared::array) perl(threads::shared::handle) perl(threads::shared::hash) perl(threads::shared::scalar) perl-forks perl-forks(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) perl(:MODULE_COMPAT_5.36.0) perl(Acme::Damn) perl(Devel::Symdump) perl(List::MoreUtils) perl(Sys::SigAction)"

inherit rpm
