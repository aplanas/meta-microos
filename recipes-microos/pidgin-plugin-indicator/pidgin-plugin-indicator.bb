SUMMARY = "StatusNotifierItem tray icon plugin for Pidgin"
DESCRIPTION = "This plugin provides a StatusNotifierItem tray icon, for use in \
MATE, KDE Plasma 5, Elementary Pantheon and other environments. \
 \
It provides all the same functionality as the original tray icon \
but not in exactly the same way: \
 * The 'smart' click behaviour that either shows the buddy list or \
   unread messages is now activated by a middle-click – because \
   left click on an libappindicator always opens the menu. \
 * As the SNI-icon is a separate process from pidgin itself, there \
   are sometimes conflicts with Focus Stealing Prevention when you \
   use the indicator to go to unread messages. You may need to \
   disable FSP for Pidgin to get around this. \
 * Due to how libayatana-appindicator work, the middle-click action \
   must also be a menu item, so it's the new Show/Hide item at the \
   top of the menu. \
 * Due to libayatana-appindicator limitations, some of the special \
   icons can't be shown next to menu items any more."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "pidgin-plugin-indicator-1.0.1-2.14.aarch64.rpm"
RPM_HASH = "88cc115fcb1b9efcb4d80674f6c976650e036b8b7a7dc1c5e7851b3d59b813606cc9295f19d19be078d8c4d3c5095eef81faf361af6a7c62ac444ed1b9bb5e6b"

RPROVIDES:${PN} += "pidgin-indicator pidgin-plugin-indicator pidgin-plugin-indicator(aarch-64)"
RDEPENDS:${PN} += "libappindicator.so.1()(64bit) libc.so.6(GLIBC_2.17)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-x11-2.0.so.0()(64bit) libpurple.so.0()(64bit) pidgin"

inherit rpm
