SUMMARY = "Openbox Render Library"
DESCRIPTION = "This subpackage contains a utility function library used by Openbox \
for theme rendering."
LICENSE = "GPL-2.0+"

PV = "3.6.1"

RPM_NAME = "libobrender32-3.6.1-3.31.aarch64.rpm"
RPM_HASH = "827289c74cd27432f2e126495aeb6a57715730ff49fe08544577426a3dc23c98179ab9ced088d1d6abb83c5dc2a41a00288d625729791e0a8f00f83066847531"

RPROVIDES:${PN} += "libobrender.so.32()(64bit) libobrender32 libobrender32(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libImlib2.so.1()(64bit) libX11.so.6()(64bit) libXft.so.2()(64bit) libc.so.6(GLIBC_2.17)(64bit) libcairo.so.2()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libobt.so.2()(64bit) libpango-1.0.so.0()(64bit) libpangoxft-1.0.so.0()(64bit) librsvg-2.so.2()(64bit)"

inherit rpm
