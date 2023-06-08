SUMMARY = "Introspection/Debugging Tool for Qt Applications"
DESCRIPTION = "The KDAB State Machine Editor Library is a framework that can be used \
to help develop State Machine Editing graphical user \
interfaces and tools. Output from such applications is in metacode \
or QML that can then be used in Qt or QtQuick projects."
LICENSE = "LGPL-2.1-only"

PV = "1.2.8"

RPM_NAME = "kdstatemachineeditor-devel-1.2.8-2.16.aarch64.rpm"
RPM_HASH = "f840fa9edf4808143e3be5033d6f597630bb52ffd3375ea158c5e0b7fe2b5e99382ec2e65e4579461e13142464254a6c118f00cd12300f4da9e22623fd711fa2"

RPROVIDES:${PN} += "cmake(KDSME) kdstatemachineeditor kdstatemachineeditor-devel kdstatemachineeditor-devel(aarch-64)"
RDEPENDS:${PN} += "libkdstatemachineeditor_core1 libkdstatemachineeditor_debuginterfaceclient1 libkdstatemachineeditor_debuginterfacesource-static libkdstatemachineeditor_view1"

inherit rpm
