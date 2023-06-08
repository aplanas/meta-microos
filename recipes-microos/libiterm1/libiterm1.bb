SUMMARY = "Internationalized Terminal Emulator Library"
DESCRIPTION = "This is a portable library for internationalized terminal emulator. All \
you need to make terminal emulator is to implements Callback functions, \
like a drawing string on specific column and row, or set \
fore/background color and so on."
LICENSE = "SUSE-CPL-0.5"

PV = "0.5.20040304"

RPM_NAME = "libiterm1-0.5.20040304-301.9.aarch64.rpm"
RPM_HASH = "60ad35529b3380659a681bb9d81316a75ffee392aea1cb13162b947bc3d36347a683dab4901eeb33f50698bca53ee031400152c493ca23ceb370f64fd46ada4a"

RPROVIDES:${PN} += "libiterm libiterm.so.1()(64bit) libiterm1 libiterm1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libfribidi.so.0()(64bit) libutempter.so.0()(64bit)"

inherit rpm
