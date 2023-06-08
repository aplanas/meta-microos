SUMMARY = "Development package for openobex"
DESCRIPTION = "Files needed for software development using openobex."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.2"

RPM_NAME = "openobex-devel-1.7.2-3.4.aarch64.rpm"
RPM_HASH = "491de45e1bcec4ba9b560ae7a1117f2ea1b3b4e5d41a0eb39b1fe90aab7ff25b6c452f98a833df3440dac857dada3056f8a5b04754cc7b31393541e5bec07b51"

RPROVIDES:${PN} += "cmake(openobex) openobex-devel openobex-devel(aarch-64) pkgconfig(openobex)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libopenobex2 pkgconfig(libusb-1.0)"

inherit rpm
