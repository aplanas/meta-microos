SUMMARY = "SiS Display Control Panel"
DESCRIPTION = "Utility to set some display properties during server runtime."
LICENSE = "GPL-2.0-only"

PV = "0.0.20051202"

RPM_NAME = "sisctrl-0.0.20051202-246.11.aarch64.rpm"
RPM_HASH = "24f62d0d993ac9d509e5a51f92a5f2e43eaa06dbfa29e3f87d274a5349d5394d1a9e35cced2f5894cc80dfa27d100af13acd08fd2982f501b3b682825ce95a8b"

RPROVIDES:${PN} += "sisctrl sisctrl(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXinerama.so.1()(64bit) libXrandr.so.2()(64bit) libXv.so.1()(64bit) libXxf86vm.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libgdk-x11-2.0.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libpango-1.0.so.0()(64bit)"

inherit rpm
