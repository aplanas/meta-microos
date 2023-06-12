SUMMARY = "Plugins for libcaca"
DESCRIPTION = "This package contains gl and x11 plugins for caca."
LICENSE = "WTFPL"

PV = "0.99.beta20"

RPM_NAME = "libcaca0-plugins-0.99.beta20-1.4.aarch64.rpm"
RPM_HASH = "f8b52ff0bfa7a8eb7453b3aa335b9e3f46ef7f9cfdcaecc1347d766e8342e5e384039081711352c2dc41d417c2959fc4a3e2ef89638ba29454dfe298425cd7b4"

RPROVIDES:${PN} += "libcaca0-plugins \
libcaca0-plugins(aarch-64) \
libgl_plugin.so.0()(64bit) \
libx11_plugin.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libX11.so.6()(64bit) \
libcaca \
libcaca.so.0()(64bit) \
libglut.so.3()(64bit)"

inherit rpm
