SUMMARY = "KDE Accounts Providers - Development Files"
DESCRIPTION = "Small system to administer web accounts for the sites \
and services across the KDE desktop, including: Google, \
Facebook, Owncloud, IMAP, Jabber and others. Devel files."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kaccounts-integration-devel-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "7143e599a1d77e37a93c4641d41ce59876cddec942c1c11b6d1c5c74bceea69200fb2723b9a5e23c50c4bb3872dba672b5bbfcb4db01b2f2bbe6e76831f86fee"

RPROVIDES:${PN} += "cmake(KAccounts) kaccounts-integration-devel kaccounts-integration-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(AccountsQt5) cmake(KF5CoreAddons) cmake(Qt5Core) intltool libkaccounts2 libsignon-qt5-devel pkgconfig(libaccounts-glib)"

inherit rpm
