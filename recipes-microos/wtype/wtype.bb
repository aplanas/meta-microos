SUMMARY = "Xdotool type for Wayland"
DESCRIPTION = "xdotool type for Wayland."
LICENSE = "MIT"

PV = "0.4"

RPM_NAME = "wtype-0.4-1.3.aarch64.rpm"
RPM_HASH = "00cb540f00869a5cb735aef7024ddfe461f7a892ad72bd97f74a56e99f1477c17a7e7b5d3a82906a5d5742b2018d989e75bd66283e7b7d786d38e41c7ecdcbb9"

RPROVIDES:${PN} += "wtype \
wtype(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libwayland-client.so.0()(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit) \
libxkbcommon.so.0(V_1.0.0)(64bit)"

inherit rpm
