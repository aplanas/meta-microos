SUMMARY = "CD/DVD/Blu-ray Burning Application by KDE"
DESCRIPTION = "Featuring a graphical interface, k3b provides various \
options for burning a CD, DVD, or BD (Blu-ray disc). Various types of \
projects are supported, including audio and data, video \
projects for DVD and VCD, as well as multi-session and mixed-mode discs. k3b \
has the ability to erase re-writeable media, and can perform more \
complicated tasks such as audiovisual encoding and decoding."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "k3b-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "49916576641e9f68ac4d33506625d19a1bc99d3ec91d318809d7500ad73f2583a2905b5b19bc34e0da8b26083ae369fdcb861125bafb1ff19b4eeaa5593c1ae0"

RPROVIDES:${PN} += "application() \
application(org.kde.k3b.desktop) \
k3b \
k3b(aarch-64) \
kde4-k3b \
libk3bdevice.so.8()(64bit) \
libk3blib.so.8()(64bit) \
metainfo() \
metainfo(org.kde.k3b.appdata.xml) \
mimehandler(application/x-cd-image) \
mimehandler(application/x-cue) \
mimehandler(application/x-iso) \
mimehandler(application/x-k3b) \
mimehandler(x-content/blank-bd) \
mimehandler(x-content/blank-cd) \
mimehandler(x-content/blank-dvd) \
mimehandler(x-content/blank-hddvd)"
RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/cdrdao \
/usr/bin/cdrecord \
/usr/bin/mkisofs \
/usr/bin/readcd \
dvd+rw-tools \
hicolor-icon-theme \
lame \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFLAC++.so.10()(64bit) \
libKF5Archive.so.5()(64bit) \
libKF5Bookmarks.so.5()(64bit) \
libKF5Cddb.so.5()(64bit) \
libKF5Completion.so.5()(64bit) \
libKF5ConfigCore.so.5()(64bit) \
libKF5ConfigWidgets.so.5()(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5FileMetaData.so.3()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5IconThemes.so.5()(64bit) \
libKF5JobWidgets.so.5()(64bit) \
libKF5KCMUtils.so.5()(64bit) \
libKF5KIOCore.so.5()(64bit) \
libKF5KIOFileWidgets.so.5()(64bit) \
libKF5KIOGui.so.5()(64bit) \
libKF5KIOWidgets.so.5()(64bit) \
libKF5NewStuffCore.so.5()(64bit) \
libKF5NewStuffWidgets.so.5()(64bit) \
libKF5Notifications.so.5()(64bit) \
libKF5NotifyConfig.so.5()(64bit) \
libKF5Solid.so.5()(64bit) \
libKF5WidgetsAddons.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Xml.so.5()(64bit) \
libQt5Xml.so.5(Qt_5)(64bit) \
libavcodec.so.60()(64bit) \
libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) \
libavformat.so.60()(64bit) \
libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) \
libavutil.so.58()(64bit) \
libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libdvdread.so.8()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libmad.so.0()(64bit) \
libmp3lame.so.0()(64bit) \
libmpcdec.so.6()(64bit) \
libogg.so.0()(64bit) \
libsamplerate.so.0()(64bit) \
libsamplerate.so.0(libsamplerate.so.0.0)(64bit) \
libsndfile.so.1()(64bit) \
libsndfile.so.1(libsndfile.so.1.0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libtag.so.1()(64bit) \
libvorbis.so.0()(64bit) \
libvorbisenc.so.2()(64bit) \
libvorbisfile.so.3()(64bit) \
shared-mime-info"

inherit rpm
