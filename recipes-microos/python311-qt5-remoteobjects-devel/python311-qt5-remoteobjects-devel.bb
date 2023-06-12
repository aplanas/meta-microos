SUMMARY = "PyQt - devel part of python bindings for QtRemoteObjects"
DESCRIPTION = "PyQt is a set of Python bindings for the Qt framework. \
 \
This package contains all the developer tools you need to create your \
own PyQt applications with QtRemoteObjects"
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception | GPL-3.0-only | NonFree"

PV = "5.15.9"

RPM_NAME = "python311-qt5-remoteobjects-devel-5.15.9-1.4.aarch64.rpm"
RPM_HASH = "237b9cb677e5063cc129498931499b94785031f8c2ede6661902204da58aa58cb04e88aae8ffc63e39969c5f50118ffa46d81271970e7e96b859f0cac43a8d89"

RPROVIDES:${PN} += "python311-qt5-remoteobjects-devel \
python311-qt5-remoteobjects-devel(aarch-64)"
RDEPENDS:${PN} += "pkgconfig(Qt5RemoteObjects) \
python(abi) \
python311-qt5-devel"

inherit rpm
