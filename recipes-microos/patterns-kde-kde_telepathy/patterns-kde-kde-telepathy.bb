SUMMARY = "KDE Telepathy"
DESCRIPTION = "KDE Applications - Telepathy"
LICENSE = "MIT"

PV = "20230403"

RPM_NAME = "patterns-kde-kde_telepathy-20230403-1.1.noarch.rpm"
RPM_HASH = "571b17e9183507e07d4f09a84f82267eef626125f1ce9c0584eb19f5dfa00116f128ed290797b5a5bbcfb756a52a63bca70f132f5b98c49c6c8c51818530c8d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern() pattern-category() pattern-extends() pattern-icon() pattern-order() patterns-kde-kde_telepathy patterns-openSUSE-kde_telephony"
RDEPENDS:${PN} += "ktp-accounts-kcm ktp-auth-handler ktp-common-internals ktp-icons ktp-kded-module signon-kwallet-extension signon-plugin-oauth2 signon-plugins signon-ui signond"

inherit rpm
