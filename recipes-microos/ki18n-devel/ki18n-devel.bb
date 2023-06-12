SUMMARY = "KDE Gettext-based UI text internationalization"
DESCRIPTION = "KI18n provides functionality for internationalizing user interface text \
in applications, based on the GNU Gettext translation system. \
It wraps the standard Gettext functionality, so that the programmers \
and translators can use the familiar Gettext tools and workflows. \
Development files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "ki18n-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "1efd2ccd8b4bad245d2050891848d5b29125dc5be90bcb563b2336c22d9dace11ea25e3f7e71178ec749f1bb865dcf1e325cee5b4600a79ff6a58b0685fe0fc5"

RPROVIDES:${PN} += "cmake(KF5I18n) \
ki18n-devel \
ki18n-devel(aarch-64)"
RDEPENDS:${PN} += "extra-cmake-modules \
gettext-runtime \
gettext-tools \
libKF5I18n5 \
python3"

inherit rpm
