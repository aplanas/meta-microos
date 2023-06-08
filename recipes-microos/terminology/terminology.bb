SUMMARY = "EFL based terminal emulator"
DESCRIPTION = "Fast and lightweight terminal emulator using EFL libraries."
LICENSE = "BSD-2-Clause & OFL-1.1"

PV = "1.13.0"

RPM_NAME = "terminology-1.13.0-1.2.aarch64.rpm"
RPM_HASH = "d62230a5ea8118366e6511422791c65f9455e0b16bd460833d744c4b7a23abb68b924b9cf694778c54587a32570d4b13bff4292384011ce93d1b83bbc7d4c038"

RPROVIDES:${PN} += "application() application(terminology.desktop) terminology terminology(aarch-64)"
RDEPENDS:${PN} += "efl elementary ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libecore.so.1()(64bit) libecore_con.so.1()(64bit) libecore_evas.so.1()(64bit) libecore_file.so.1()(64bit) libecore_imf.so.1()(64bit) libecore_imf_evas.so.1()(64bit) libecore_input.so.1()(64bit) libecore_ipc.so.1()(64bit) libedje.so.1()(64bit) libeet.so.1()(64bit) libefreet.so.1()(64bit) libeina.so.1()(64bit) libelementary.so.1()(64bit) libemotion.so.1()(64bit) libethumb_client.so.1()(64bit) libevas.so.1()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) terminology-theme-dft"

inherit rpm
