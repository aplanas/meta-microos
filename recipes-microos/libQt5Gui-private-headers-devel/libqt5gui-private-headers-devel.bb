SUMMARY = "Non-ABI stable experimental API for the Qt5 GUI library"
DESCRIPTION = "This package provides private headers of libQt5Gui that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libQt5Gui-private-headers-devel-5.15.9+kde154-1.2.noarch.rpm"
RPM_HASH = "4d0b9c921f5831fb3487fd68c8532b46571e9b4ca7c2f826e2597839d395893657ff0fdef2bec4b5f94f239a366f89ce0046b07387521eaed33f9a2125298299"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Gui-private-headers-devel"
RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-devel"

inherit rpm
