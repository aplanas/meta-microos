SUMMARY = "Nautilus plugin for sharing directories over SMB"
DESCRIPTION = "An application for the GNOME desktop integrated into Nautilus \
which allows use of Nautilus shares without signing in as root. \
 \
Features: \
 \
* A new command in the Nautilus context menu \
  (Menu key or right click). \
 \
* A dialog to share a directory, which allows choosing a \
  name and decide on read-only/read-write status. \
 \
* Possibility to access the share settings from the Properties \
  tab of a directory. \
 \
* Possibility to examine whether a share name already exists by \
  typing it. \
 \
* Nautilus displays a palm icon to visually show which \
  directories are shared."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.5"

RPM_NAME = "nautilus-share-0.7.5-2.3.aarch64.rpm"
RPM_HASH = "c8a3189bdb0f0f05b298eae8558663d7633769409e6096f510d8402f2c22f4c1654f86688a34eb33065adbd364ff0f3320dd31af1c3d1f1d517add444f57151b"

RPROVIDES:${PN} += "libnautilus-share.so()(64bit) nautilus-share nautilus-share(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-4.so.1()(64bit) libnautilus-extension.so.4()(64bit) samba-client"

inherit rpm
