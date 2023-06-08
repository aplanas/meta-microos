SUMMARY = "Kerberos 5 ticket monitoring tray applet"
DESCRIPTION = "krb5-auth-dialog is a tray applet that monitors and refreshes your \
Kerberos ticket. It pops up reminders when the ticket is about to \
expire. \
 \
It features ticket autorenewal and supports pkinit."
LICENSE = "GPL-2.0-or-later"

PV = "44.0.alpha1"

RPM_NAME = "krb5-auth-dialog-44.0.alpha1-1.1.aarch64.rpm"
RPM_HASH = "d309f585902fe10980e4e5b8967c704796bd4bc3afb161250ee36a4b2b2cd00ffc5a5ef0e13e4c164d07bc6c5856a376f13d332e100320904f7b458d2293916e"

RPROVIDES:${PN} += "application() application(org.gnome.KrbAuthDialog.desktop) krb5-auth-dialog krb5-auth-dialog(aarch-64) libka-plugin-afs.so()(64bit) libka-plugin-dummy.so()(64bit) libka-plugin-gnomelock.so()(64bit) libka-plugin-pam.so()(64bit) metainfo() metainfo(org.gnome.KrbAuthDialog.metainfo.xml)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libadwaita-1.so.0()(64bit) libadwaita-1.so.0(LIBADWAITA_1_0)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-4.so.1()(64bit) libkrb5.so.3()(64bit) libkrb5.so.3(krb5_3_MIT)(64bit)"

inherit rpm
