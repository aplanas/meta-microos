SUMMARY = "PyQt - devel part of python bindings for QtRemoteObjects"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications with QtRemoteObjects"
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python310-qt5-remoteobjects-devel-5.15.9-1.4.aarch64.rpm"
RPM_HASH = "fe5efb400bd1b619e50309c6be88f94ce099825f48c1b870fe84ae8958052de58761bb7f259e0a71cbb41a4d0db4a70798aa0411a5ee0aa5db350d5a650b5af5"

RPROVIDES:${PN} += "python3-qt5-remoteobjects-devel python310-qt5-remoteobjects-devel python310-qt5-remoteobjects-devel(aarch-64)"
RDEPENDS:${PN} += "pkgconfig(Qt5RemoteObjects) python(abi) python310-qt5-devel"

inherit rpm
