SUMMARY = "Ruby Bindings for kross"
DESCRIPTION = "The Ruby bindings which can be used with KROSS"
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "kross-ruby-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "8b8a0724f39cf4b8b79ab7e690a9a20dfacac309b49df632963674c3d50539dae265ceed3c80d75be7616a517cf840fdb57a518a17f1415f4d78cd114ce73467"

RPROVIDES:${PN} += "kross-ruby kross-ruby(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5KrossCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libruby3.2.so.3.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
