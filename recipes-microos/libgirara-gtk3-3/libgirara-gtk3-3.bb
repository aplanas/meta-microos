SUMMARY = "A graphical user interface library"
DESCRIPTION = "girara is a library that implements a user interface that focuses on \
simplicity and minimalism. Currently based on GTK+, \
it provides an interface that focuses on three main \
components: A so-called view widget that represents the actual \
application (e.g. a website (browser), an image (image viewer) or the \
document (document viewer)), an input bar that is used to execute \
commands of the application and the status bar which provides the user \
with current information. girara was designed to replace and enhance \
the user interface that is used by zathura and jumanji and other \
features that those applications share."
LICENSE = "Zlib"

PV = "0.3.9"

RPM_NAME = "libgirara-gtk3-3-0.3.9-1.3.aarch64.rpm"
RPM_HASH = "ade663c50c690dca73ffd51961b6076501bc7975ca8b5c8cefa63b55d05d02e4b8eaccf5b1a51d2848351e197058b5fc305f34a25dda961706560877795c1e5d"

RPROVIDES:${PN} += "libgirara-gtk3-3 libgirara-gtk3-3(aarch-64) libgirara-gtk3.so.3()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libpango-1.0.so.0()(64bit)"

inherit rpm
