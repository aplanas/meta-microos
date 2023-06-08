SUMMARY = "QtQuick bindings for kpipewire"
DESCRIPTION = "KPipeWire provides PipeWire integration for the Plasma desktop and mobile shells. \
This package provides QtQuick bindings for the main KPipeWire libraries."
LICENSE = "LGPL-2.0-only & LGPL-3.0-only"

PV = "5.27.4"

RPM_NAME = "kpipewire-imports-5.27.4-1.2.aarch64.rpm"
RPM_HASH = "e18fdb75a6d3066022daae6dc78145e4e4ca9fa256bddb3712e42d56f0a57f82566a364f41d548c2f09e1151d88c4213f88cdadb7950406037e09df2de9a3e34"

RPROVIDES:${PN} += "kpipewire-imports kpipewire-imports(aarch-64) libKPipeWireDeclarative.so()(64bit) libKPipeWireRecordDeclarative.so()(64bit) qt5qmlimport(org.kde.pipewire.0) qt5qmlimport(org.kde.pipewire.record.0)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKPipeWire.so.5()(64bit) libKPipeWire5 libKPipeWireDmaBuf5 libKPipeWireRecord.so.5()(64bit) libKPipeWireRecord5 libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
