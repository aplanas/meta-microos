SUMMARY = "LXQt Image Viewer"
DESCRIPTION = "Image Viewer for LXQt and Thumbnail Generator for PCManFM-Qt"
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "lximage-qt-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "742b4fbbae1ab73574c08680476bdfdb719502b7da11f7b4492282a28cd5654495cca6421e68cf85809479a2b18a27b3af22b071ccf8ce2ad1f59f80a5615fd3"

RPROVIDES:${PN} += "application() application(lximage-qt.desktop) lximage-qt lximage-qt(aarch-64) metainfo() metainfo(lximage-qt.metainfo.xml) mimehandler(application/pcx) mimehandler(image/bmp) mimehandler(image/gif) mimehandler(image/jpeg) mimehandler(image/jpg) mimehandler(image/png) mimehandler(image/svg+xml) mimehandler(image/svg-xml) mimehandler(image/tiff) mimehandler(image/webp) mimehandler(image/x-bmp) mimehandler(image/x-pcx) mimehandler(image/x-portable-bitmap) mimehandler(image/x-portable-greymap) mimehandler(image/x-portable-pixmap) mimehandler(image/x-targa) mimehandler(image/x-tga)"
RDEPENDS:${PN} += "desktop-file-utils ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5DBus.so.5()(64bit) libQt5DBus.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Svg.so.5()(64bit) libQt5Svg.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5X11Extras.so.5()(64bit) libQt5X11Extras.so.5(Qt_5)(64bit) libX11.so.6()(64bit) libXfixes.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libexif.so.12()(64bit) libfm-qt.so.13()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.26)(64bit)"

inherit rpm
