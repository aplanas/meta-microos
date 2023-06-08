SUMMARY = "Standard C++ Library Locales"
DESCRIPTION = "The standard C++ library locale data."
LICENSE = "GPL-3.0-or-later-WITH-GCC-exception-3.1"

PV = "11.3.1+git2076"

RPM_NAME = "libstdc++6-gcc11-locale-11.3.1+git2076-2.3.aarch64.rpm"
RPM_HASH = "3fbff14b2451b601c001501902b11568c63fa4814c136290576baf3822ba4d0df61aa0063b94829cc327ea673283b43235ff8e22bacd9c8511b2cf4dd7d876c7"

RPROVIDES:${PN} += "libstdc++6-gcc11-locale libstdc++6-gcc11-locale(aarch-64) libstdc++6-locale locale(libstdc++6-gcc11:de) locale(libstdc++6-gcc11:fr)"
RDEPENDS:${PN} += ""

inherit rpm
