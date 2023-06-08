SUMMARY = "A m17n plugin for mlterm"
DESCRIPTION = "A plugin to use the m17n input methods directly from mlterm."
LICENSE = "BSD-3-Clause"

PV = "3.9.2"

RPM_NAME = "mlterm-m17n-3.9.2-3.3.aarch64.rpm"
RPM_HASH = "aaa968f22f21b7fc440711362fa77d7afb36b102a115431c6a4cf239b6466f7a13e64c540137d453ff5a30c002bc8d3df227f25f9667405dcc8fe4455a207d0d"

RPROVIDES:${PN} += "libim-m17nlib-sdl2.so()(64bit) libim-m17nlib-wl.so()(64bit) libim-m17nlib.so()(64bit) locale(m17n:ja;ko;zh;ar;he) mlterm-m17n mlterm-m17n(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm17n-core.so.0()(64bit) libm17n.so.0()(64bit) libpobl.so.2()(64bit)"

inherit rpm
