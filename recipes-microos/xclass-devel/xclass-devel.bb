SUMMARY = "Development files for xclass"
DESCRIPTION = "This package contains development files for xclass library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.2"

RPM_NAME = "xclass-devel-0.9.2-188.6.aarch64.rpm"
RPM_HASH = "f23f4b7c108a009ac7e676826b0391cc12b17f8202716657f614dad47ddeb1329493c0ecaa46dad160cf5cb4fbbc0d0a76eeaa7bfc74f04404db7acdc2dbe9a6"

RPROVIDES:${PN} += "xclass-devel xclass-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh libstdc++-devel libxclass-0_9_2 pkgconfig pkgconfig(gl) pkgconfig(x11) pkgconfig(xpm)"

inherit rpm
