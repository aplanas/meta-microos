SUMMARY = "Development package for kdevelop5-plugin-php"
DESCRIPTION = "This package contains the development files needed in order to use the \
kdevelop5-plugin-php API."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "kdevelop5-plugin-php-devel-23.04.0-1.2.aarch64.rpm"
RPM_HASH = "e1f7fa4e1b297de4cbaeac9689a719eadc7db1222f93ce3251e5f035330473b38dde308d17b6e28ae6b806f22a886ee5e07af30b166c7cf47d2113e1999efa4b"

RPROVIDES:${PN} += "cmake(KDevPHP) kdevelop5-plugin-php-devel kdevelop5-plugin-php-devel(aarch-64)"
RDEPENDS:${PN} += "kdevelop5-plugin-php"

inherit rpm
