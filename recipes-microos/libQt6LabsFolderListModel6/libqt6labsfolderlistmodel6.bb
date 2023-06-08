SUMMARY = "Qt 6 LabsFolderListModel library"
DESCRIPTION = "The Qt 6 LabsFolderListModel library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.0"

RPM_NAME = "libQt6LabsFolderListModel6-6.5.0-2.1.aarch64.rpm"
RPM_HASH = "e8b91688314257ebc65b9da6dd6133d9986582806014324f4e70905d75786acc92e09a2547a9d8538ea9dfac86c8cec885f7b676caee6310df5c04fe67744534"

RPROVIDES:${PN} += "libQt6LabsFolderListModel.so.6()(64bit) libQt6LabsFolderListModel.so.6(Qt_6)(64bit) libQt6LabsFolderListModel.so.6(Qt_6.0)(64bit) libQt6LabsFolderListModel.so.6(Qt_6.1)(64bit) libQt6LabsFolderListModel.so.6(Qt_6.2)(64bit) libQt6LabsFolderListModel.so.6(Qt_6.3)(64bit) libQt6LabsFolderListModel.so.6(Qt_6.4)(64bit) libQt6LabsFolderListModel.so.6(Qt_6.5)(64bit) libQt6LabsFolderListModel.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libQt6LabsFolderListModel6 libQt6LabsFolderListModel6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6Qml.so.6()(64bit) libQt6Qml.so.6(Qt_6)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
