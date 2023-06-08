SUMMARY = "GStreamer pipeline validator"
DESCRIPTION = "GstValidate detects when elements are not behaving as expected and \
report it to the user so he knows how things are supposed to work \
inside a GstPipeline. In the end, fixing issues found by the tool will \
ensure that all elements behave all together in the expected way."
LICENSE = "LGPL-2.1-or-later"

PV = "1.22.2"

RPM_NAME = "libgstvalidate-1_0-0-1.22.2-1.1.aarch64.rpm"
RPM_HASH = "240b5c521fd29c54091fed6e5eb83d265c30dbcf2c1f77ce9ecf966a90ef08757e9ab2c446c863e8d175a433715f9065327d8e1e69c81cf21880c1965b0a2886"

RPROVIDES:${PN} += "libgstvalidate-1.0.so.0()(64bit) libgstvalidate-1_0-0 libgstvalidate-1_0-0(aarch-64) libgstvalidate-default-overrides-1.0.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgstbase-1.0.so.0()(64bit) libgstcheck-1.0.so.0()(64bit) libgstcontroller-1.0.so.0()(64bit) libgstpbutils-1.0.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgstvideo-1.0.so.0()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
