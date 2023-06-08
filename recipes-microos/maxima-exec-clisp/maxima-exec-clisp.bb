SUMMARY = "Maxima compiled with clisp"
DESCRIPTION = "Maxima compiled with Common Lisp."
LICENSE = "GPL-2.0-or-later"

PV = "5.46.0"

RPM_NAME = "maxima-exec-clisp-5.46.0-1.19.aarch64.rpm"
RPM_HASH = "f155b02f9efb59d0ddfc0994df55ba01c7c692a3993d999e7f74eae8ddac569f89be80455a82935fc197f2df44eae9f232385cad586093e2b94bcd58152266ef"

RPROVIDES:${PN} += "maxima-exec-clisp maxima-exec-clisp(aarch-64) maxima_exec"
RDEPENDS:${PN} += "clisp ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypt.so.1()(64bit) libcrypt.so.1(XCRYPT_2.0)(64bit) libffcall.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.23)(64bit) libreadline.so.8()(64bit) libreadline.so.8(READLINE_6.3)(64bit) libreadline.so.8(READLINE_7.0)(64bit) libsigsegv.so.2()(64bit) libtinfo.so.6()(64bit) libtinfo.so.6(NCURSES6_TINFO_5.0.19991023)(64bit)"

inherit rpm
