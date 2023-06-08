SUMMARY = "Translations for package lxqt-notificationd"
DESCRIPTION = "Provides translations for the 'lxqt-notificationd' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0"

RPM_NAME = "lxqt-notificationd-lang-1.3.0-1.1.noarch.rpm"
RPM_HASH = "88b6229cb54c6e619247ebdad5b72ea3df4013e79746cfb8fab2380502ca3fdde865b0ad8b3fc0a9bcbd874c1aae30b22bda69f5a85608a265905369e3305a8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lxqt-notificationd-lang lxqt-notificationd-lang-all"
RDEPENDS:${PN} += "lxqt-notificationd"

inherit rpm
