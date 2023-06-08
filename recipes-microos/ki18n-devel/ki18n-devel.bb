SUMMARY = "KDE Gettext-based UI text internationalization"
DESCRIPTION = "KI18n provides functionality for internationalizing user interface text \
in applications, based on the GNU Gettext translation system. \
It wraps the standard Gettext functionality, so that the programmers \
and translators can use the familiar Gettext tools and workflows. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.105.0"

RPM_NAME = "ki18n-devel-5.105.0-1.2.aarch64.rpm"
RPM_HASH = "930ae6a11bf2522ea08196910caacbce8a65a903564442e3a07c917f44eab18c3b68466951ef654dfd9e847ff2cf09940fc8c9cbc902a6fc0bc10470ee3b3c35"

RPROVIDES:${PN} += "cmake(KF5I18n) ki18n-devel ki18n-devel(aarch-64)"
RDEPENDS:${PN} += "extra-cmake-modules gettext-runtime gettext-tools libKF5I18n5 python3"

inherit rpm
