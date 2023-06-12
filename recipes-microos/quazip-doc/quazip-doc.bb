SUMMARY = "Documentation for quazip, a C++ wrapper for ZIP/UNZIP"
DESCRIPTION = "A C++ wrapper for the Gilles Vollant's ZIP/UNZIP C package, using Qt toolkit. \
Useful to access ZIP archives from Qt programs. \
 \
This package contains documentation for quazip."
LICENSE = "GPL-2.0-or-later | LGPL-2.1-or-later"

PV = "1.4"

RPM_NAME = "quazip-doc-1.4-2.3.noarch.rpm"
RPM_HASH = "21f26eeec6327f6f7a237154a8f6864fc3c90e25aa976bf2c0a7a671b60156b84f5b16bda8cf6a60a9e16781d7f37c09d674458aa220fd67e7dc58902849a0f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libquazip-qt5-doc \
quazip-doc \
quazip-qt5-doc"
RDEPENDS:${PN} += ""

inherit rpm
