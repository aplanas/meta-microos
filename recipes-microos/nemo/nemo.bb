SUMMARY = "File browser for Cinnamon"
DESCRIPTION = "Nemo is the file manager for the Cinnamon desktop environment."
LICENSE = "GPL-2.0-or-later"

PV = "5.6.4"

RPM_NAME = "nemo-5.6.4-1.2.aarch64.rpm"
RPM_HASH = "ed54b2b2bf4432186a55c1bde241003fe0e6e5369e3b751b7cce8fc6eff619cefc7c29c658edcd80165318a09de289efcbbfa6a7eac5d04bf5aed56212148eaf"

RPROVIDES:${PN} += "application() application(nemo-autorun-software.desktop) application(nemo-autostart.desktop) application(nemo.desktop) mimehandler(application/x-gnome-saved-search) mimehandler(inode/directory) mimehandler(x-content/unix-software) nemo nemo(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/env /usr/bin/python3 desktop-file-utils glib2-tools gvfs ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libX11.so.6()(64bit) libatk-1.0.so.0()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo-gobject.so.2()(64bit) libcairo.so.2()(64bit) libcinnamon-desktop.so.4()(64bit) libexempi.so.8()(64bit) libexif.so.12()(64bit) libgailutil-3.so.0()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgsf-1.so.114()(64bit) libgtk-3.so.0()(64bit) libnemo-extension.so.1()(64bit) libpango-1.0.so.0()(64bit) libpangocairo-1.0.so.0()(64bit) libxapp.so.1()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) python3 shared-mime-info"

inherit rpm
