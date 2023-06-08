SUMMARY = "Openbox Toolkit Library"
DESCRIPTION = "This subpackage contains a utility function library used by Openbox \
to load and parse configuration and theme files of Openbox."
LICENSE = "GPL-2.0+"

PV = "3.6.1"

RPM_NAME = "libobt2-3.6.1-3.31.aarch64.rpm"
RPM_HASH = "423a64f9f9b12bf085f3ed1de0c52cc568f01bb8df352f9fc08fe8760d1c362ce882ee76c18dc8317b6864a2d707c40eb1fb170c63a37f78aa4df4ec95aa3140"

RPROVIDES:${PN} += "libobt.so.2()(64bit) libobt2 libobt2(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libXext.so.6()(64bit) libXinerama.so.1()(64bit) libXrandr.so.2()(64bit) libc.so.6(GLIBC_2.33)(64bit) libglib-2.0.so.0()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.3)(64bit)"

inherit rpm
