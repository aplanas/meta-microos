SUMMARY = "Utilities from xkbcommon"
DESCRIPTION = "xkbcommon tools for introspection and debugging."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "libxkbcommon-tools-1.5.0-1.3.aarch64.rpm"
RPM_HASH = "30724622a2eaa7fd8f848ad124c8006f3ef08a81bbb9936ce8a51ef94242cfe9fd9079e1c643323e73cffad321c6434210ef0f17cc516bd79689b235b37a21c8"

RPROVIDES:${PN} += "libxkbcommon-tools libxkbcommon-tools(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libwayland-client.so.0()(64bit) libxcb-xkb.so.1()(64bit) libxcb.so.1()(64bit) libxkbcommon-x11.so.0()(64bit) libxkbcommon-x11.so.0(V_0.5.0)(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit) libxkbcommon.so.0(V_0.6.0)(64bit) libxkbcommon.so.0(V_0.7.0)(64bit) libxkbcommon.so.0(V_1.0.0)(64bit) libxkbregistry.so.0()(64bit) libxkbregistry.so.0(V_1.0.0)(64bit)"

inherit rpm
