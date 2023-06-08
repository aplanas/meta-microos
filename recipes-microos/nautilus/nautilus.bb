SUMMARY = "File Manager for the GNOME Desktop"
DESCRIPTION = "Nautilus is the file manager for the GNOME desktop."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "44.1"

RPM_NAME = "nautilus-44.1-1.1.aarch64.rpm"
RPM_HASH = "f47d43eb7e54f5d4ce90deed1e06ff6649a2f2762f8b837806d37df13f7f1d9f1afdd98a885df983f2023cff59e02842ff90cec53c77763d70426a52081b4187"

RPROVIDES:${PN} += "application() application(mount-archive.desktop) application(nautilus-autorun-software.desktop) application(org.gnome.Nautilus.desktop) metainfo() metainfo(org.gnome.Nautilus.appdata.xml) mimehandler(application/bzip2) mimehandler(application/gzip) mimehandler(application/vnd.rar) mimehandler(application/x-7z-compressed) mimehandler(application/x-7z-compressed-tar) mimehandler(application/x-bzip) mimehandler(application/x-bzip-compressed-tar) mimehandler(application/x-cd-image) mimehandler(application/x-compress) mimehandler(application/x-compressed-tar) mimehandler(application/x-cpio) mimehandler(application/x-gzip) mimehandler(application/x-lha) mimehandler(application/x-lzip) mimehandler(application/x-lzip-compressed-tar) mimehandler(application/x-lzma) mimehandler(application/x-lzma-compressed-tar) mimehandler(application/x-tar) mimehandler(application/x-tarz) mimehandler(application/x-xar) mimehandler(application/x-xz) mimehandler(application/x-xz-compressed-tar) mimehandler(application/x-zstd-compressed-tar) mimehandler(application/zip) mimehandler(application/zstd) mimehandler(inode/directory) mimehandler(x-content/unix-software) nautilus nautilus(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libadwaita-1.so.0()(64bit) libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libcloudproviders.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgnome-autoar-0.so.0()(64bit) libgnome-desktop-4.so.2()(64bit) libgobject-2.0.so.0()(64bit) libgtk-4.so.1()(64bit) libnautilus-extension.so.4()(64bit) libpango-1.0.so.0()(64bit) libportal-gtk4.so.1()(64bit) libportal.so.1()(64bit) libtracker-sparql-3.0.so.0()(64bit) tracker-miner-files"

inherit rpm
