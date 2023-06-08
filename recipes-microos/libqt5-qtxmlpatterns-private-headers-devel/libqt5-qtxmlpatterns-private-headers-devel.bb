SUMMARY = "Non-ABI stable experimental API for the Qt5 XML Patterns library"
DESCRIPTION = "This package provides private headers of libqt5-qtxmlpatterns that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "5.15.9+kde0"

RPM_NAME = "libqt5-qtxmlpatterns-private-headers-devel-5.15.9+kde0-1.1.noarch.rpm"
RPM_HASH = "924313fff5657f8f896a18cdd89dfa72c2cc563976051f0b094b890be5ce824fc4e7ac4112f2e541fe624b8d1b2e616a4e269c641e2f84fe2123608b21888cc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5XmlPatterns-private-headers-devel libqt5-qtxmlpatterns-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel libqt5-qtxmlpatterns-devel"

inherit rpm
