SUMMARY = "Utility library for getting window manager settings"
DESCRIPTION = "This library is used by MATE control center to change preferences \
of window managers."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "libmate-window-settings1-1.26.0-1.10.aarch64.rpm"
RPM_HASH = "9100da5e6851e2f7b26158e3b932e58b10dbca4056f898c107505e340fee0db7f74d6226d09af88d004618711cf382d31bea481e3796e66d58cc63800af99c90"

RPROVIDES:${PN} += "libmate-window-settings.so.1()(64bit) libmate-window-settings1 libmate-window-settings1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-3.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libmate-desktop-2.so.17()(64bit)"

inherit rpm
