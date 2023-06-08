SUMMARY = "Standard C++ Library Locales"
DESCRIPTION = "The standard C++ library locale data."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libstdc++6-gcc7-locale-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "aba9f9138baf2677b8d2194cb118f16f7910ccfc97df92638c727cd098dca052989f47be728a7bc174e5634311b1a5a6752e16ed519047f9a5ad1d4cacaaae0f"

RPROVIDES:${PN} += "libstdc++6-gcc7-locale libstdc++6-gcc7-locale(aarch-64) libstdc++6-locale locale(libstdc++6-gcc7:de) locale(libstdc++6-gcc7:fr)"
RDEPENDS:${PN} += ""

inherit rpm
