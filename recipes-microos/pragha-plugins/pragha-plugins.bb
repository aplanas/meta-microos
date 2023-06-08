SUMMARY = "Plugins for Pragha"
DESCRIPTION = "This package includes plugins for the Pragha player. \
 \
* AcoustID - Get metadata on AcoustID service. \
* Ampache - Append music on Ampache server. \
* CD-ROM - Play Audio CDs. \
* Devices - Management removable devices. \
* DLNA Server - Share your playlist on a DLNA server. \
* DLNA Renderer - Play music on a DLNA server. \
* Global Hotkeys - Control Pragha with multimedia keys. \
* Global Hotkeys with gnome-media-keys daemon - Control Pragha with \
  gnome-media-keys daemon. \
* Koel - Append music on Koel server. \
* Last.fm - Scrobbling, love, unlove song and append similar song to get \
  related playlists. \
* MPRIS2 - Control Pragha with MPRIS2 interface. \
* MTP Devices - Management MTP devices. \
* Notification - Show notification when change songs. \
* Removable Media - Detect removable media and scan it. \
* Song Info - Get Artist info, Lyrics and Album arts of yours songs. \
* Get radios - Get radios on TuneIn."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.99.1"

RPM_NAME = "pragha-plugins-1.3.99.1-3.3.aarch64.rpm"
RPM_HASH = "706a75d8c96ee9fc1ae303369a3688d9d0c53877ce982da3616217bfd5fe87dd4f54c472fb9abe6810c33180587dc027c15b3d02885bfcd46681bb11c671988f"

RPROVIDES:${PN} += "libacoustid.so()(64bit) libcdrom.so()(64bit) libgnome-media-keys.so()(64bit) libkeybinder.so()(64bit) libmpris2.so()(64bit) libnotify.so()(64bit) libpampache.so()(64bit) libpdlnarenderer.so()(64bit) libpkoel.so()(64bit) libplastfm.so()(64bit) libpmtp.so()(64bit) libremovable.so()(64bit) libsong-info.so()(64bit) libtunein.so()(64bit) libvisualizer.so()(64bit) pragha-plugins pragha-plugins(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libcairo.so.2()(64bit) libcddb.so.2()(64bit) libcdio.so.19()(64bit) libcdio.so.19(CDIO_19)(64bit) libcdio_cdda.so.2()(64bit) libcdio_cdda.so.2(CDIO_CDDA_2)(64bit) libclastfm.so.0()(64bit) libgdk-3.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libglyr.so.1()(64bit) libgobject-2.0.so.0()(64bit) libgrilo-0.3.so.0()(64bit) libgrlnet-0.3.so.0()(64bit) libgstreamer-1.0.so.0()(64bit) libgtk-3.so.0()(64bit) libgudev-1.0.so.0()(64bit) libjson-glib-1.0.so.0()(64bit) libjson-glib-1.0.so.0(libjson-glib-1.0.so.0)(64bit) libkeybinder-3.0.so.0()(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libmtp.so.9()(64bit) libnotify.so.4()(64bit) libpango-1.0.so.0()(64bit) libpeas-1.0.so.0()(64bit) libpragha.so()(64bit) libsoup-2.4.so.1()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) pragha"

inherit rpm
