SUMMARY = "KDE Accounts Providers - Development Files"
DESCRIPTION = "Small system to administer web accounts for the sites \
and services across the KDE desktop, including: Google, \
Facebook, Owncloud, IMAP, Jabber and others. Devel files."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kaccounts-integration-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "78e609e69dd1c0df09e7f4f7280cfb42873118919ae94a114866f4934521095a410ee39d0526321357d7085881ce89ebee13aadab766017afcf47bbe95a41053"

RPROVIDES:${PN} += "cmake(KAccounts) kaccounts-integration-devel kaccounts-integration-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(AccountsQt5) cmake(KF5CoreAddons) cmake(Qt5Core) intltool libkaccounts2 libsignon-qt5-devel pkgconfig(libaccounts-glib)"

inherit rpm
