SUMMARY = "GNOME Command Line Dialog Utility"
DESCRIPTION = "Zenity is a basic rewrite of gdialog, without the pain involved of \
trying to figure out commandline parsing.  Zenity is zen-like; simple \
and easy to use. \
 \
Zenity Dialogs: Calendar, Text Entry, Error, Informational, File \
Selection, List, Progress, Question, Text Information, Warning and \
Password. \
 \
Zenity is especially useful in scripts."
LICENSE = "LGPL-2.1-or-later"

PV = "3.92.0"

RPM_NAME = "zenity-3.92.0-1.1.aarch64.rpm"
RPM_HASH = "106cabfbe390ce0046e9ee5e8c5e1cc0a9a89a3cd0920a42a92c3a4f644cc3e9b7cf9ff5af728d4bca4b9dfb92a8e1655ffe9073ab0719b0aa9ae5d3d88240fd"

RPROVIDES:${PN} += "application() application(org.gnome.Zenity.desktop) zenity zenity(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libadwaita-1.so.0()(64bit) libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-4.so.1()(64bit) libpango-1.0.so.0()(64bit)"

inherit rpm
