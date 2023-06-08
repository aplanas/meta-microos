SUMMARY = "Plymouth 'script' plugin"
DESCRIPTION = "This package contains the 'tribar' boot splash plugin for \
Plymouth. It features an extensible, scriptable boot splash \
language that simplifies the process of designing custom \
boot splash themes."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-plugin-tribar-22.02.122+94.4bd41a3-4.1.aarch64.rpm"
RPM_HASH = "a248e4ae720a232261230a4681523221d5d98047e53b7c64b89687a5e5f6437fe5d87042b2cc82af0ee616690c75bcb76e1cae22877ce2d36006d3be67019f52"

RPROVIDES:${PN} += "plymouth-plugin-tribar plymouth-plugin-tribar(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libply-splash-core.so.5()(64bit) libply-splash-core5 libply-splash-graphics5 libply.so.5()(64bit) libply5"

inherit rpm
