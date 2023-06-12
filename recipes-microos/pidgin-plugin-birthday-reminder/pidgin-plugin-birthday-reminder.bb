SUMMARY = "Pidgin plugin to remind you of the birthdays of your buddies"
DESCRIPTION = "Pidgin Birthday Reminder reminds you of your buddies birthdays. \
Birthdays can be set by hand or be automatically filled-in for ICQ, \
Skype and XMPP protocols."
LICENSE = "GPL-2.0-or-later"

PV = "1.13"

RPM_NAME = "pidgin-plugin-birthday-reminder-1.13-1.6.aarch64.rpm"
RPM_HASH = "14eef2445581b6b3590b6edb81055e0d139729613f5334f8ec8681117e3b6443550a3d8d11e17e7e6df57795d04f562e6624a660af6f037efeae02777b24723b"

RPROVIDES:${PN} += "metainfo() \
metainfo(pidgin-birthday-reminder.metainfo.xml) \
pidgin-birthday-reminder \
pidgin-plugin-birthday-reminder \
pidgin-plugin-birthday-reminder(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libpurple.so.0()(64bit) \
pidgin"

inherit rpm
