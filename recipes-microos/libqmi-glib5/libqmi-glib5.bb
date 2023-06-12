SUMMARY = "Library to control QMI devices"
DESCRIPTION = "libqmi is a glib-based library for talking to WWAN modems and devices \
which speak the Qualcomm MSM Interface (QMI) protocol."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "1.32.4"

RPM_NAME = "libqmi-glib5-1.32.4-1.1.aarch64.rpm"
RPM_HASH = "121c95110630009759daf79ad276086146ddcb59bf0f8355f15db2455229edc45a80acc0d12b12d52e1df41b1a242ee7093e43128af72f465cd935be10b82a5b"

RPROVIDES:${PN} += "libqmi-glib.so.5()(64bit) \
libqmi-glib5 \
libqmi-glib5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libmbim-glib.so.4()(64bit) \
libqrtr-glib.so.0()(64bit)"

inherit rpm
