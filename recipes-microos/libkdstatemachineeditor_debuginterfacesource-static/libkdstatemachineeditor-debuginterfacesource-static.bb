SUMMARY = "KDAB State Machine Editor core library"
DESCRIPTION = "The KDAB State Machine Editor Library is a framework that can be used \
to help develop State Machine Editing graphical user \
interfaces and tools. Output from such applications is in metacode \
or QML that can then be used in Qt or QtQuick projects. \
 \
This package provides a static library that can be injected into a \
process running on the target in order to get information about the \
internal state machines."
LICENSE = "LGPL-2.1-only"

PV = "1.2.8"

RPM_NAME = "libkdstatemachineeditor_debuginterfacesource-static-1.2.8-2.16.aarch64.rpm"
RPM_HASH = "84c8aba26d6a80bb561bebb3c2e9caf8e34783a06609c88e9fe20d37db1c547094f0fe7381b8c3c0f10f3560d20113bfe739dc13f5fa75cfa652061f81303da9"

RPROVIDES:${PN} += "libkdstatemachineeditor_debuginterfacesource-static \
libkdstatemachineeditor_debuginterfacesource-static(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
