SUMMARY = "RPM provides for QML modules from qtdeclarative"
DESCRIPTION = "A separately built package to avoid a build cycle."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "qtdeclarative-imports-provides-qt6-1.0-1.25.aarch64.rpm"
RPM_HASH = "4d8945774a89d9b1498202be25284d75f4ce1ca6199426f55095991090baddd03ccfb702af614d843e22e42f3d6440b114d5062f1d518648bf96412f62872bb5"

RPROVIDES:${PN} += "qt6qmlimport(Qt.labs.sharedimage.1) qt6qmlimport(Qt.labs.sharedimage.6) qt6qmlimport(QtQuick.Controls.2) qt6qmlimport(QtQuick.Controls.6) qt6qmlimport(QtQuick.Controls.Basic.2) qt6qmlimport(QtQuick.Controls.Basic.6) qt6qmlimport(QtQuick.Controls.Basic.impl.2) qt6qmlimport(QtQuick.Controls.Basic.impl.6) qt6qmlimport(QtQuick.Controls.Fusion.2) qt6qmlimport(QtQuick.Controls.Fusion.6) qt6qmlimport(QtQuick.Controls.Fusion.impl.2) qt6qmlimport(QtQuick.Controls.Fusion.impl.6) qt6qmlimport(QtQuick.Controls.Imagine.2) qt6qmlimport(QtQuick.Controls.Imagine.6) qt6qmlimport(QtQuick.Controls.Imagine.impl.6) qt6qmlimport(QtQuick.Controls.Material.2) qt6qmlimport(QtQuick.Controls.Material.6) qt6qmlimport(QtQuick.Controls.Material.impl.2) qt6qmlimport(QtQuick.Controls.Material.impl.6) qt6qmlimport(QtQuick.Controls.Universal.2) qt6qmlimport(QtQuick.Controls.Universal.6) qt6qmlimport(QtQuick.Controls.Universal.impl.2) qt6qmlimport(QtQuick.Controls.Universal.impl.6) qt6qmlimport(QtQuick.Dialogs.quickimpl.6) qt6qmlimport(QtQuick.NativeStyle.2) qt6qmlimport(QtQuick.NativeStyle.6) qt6qmlimport(QtQuick.Shapes.1) qt6qmlimport(QtQuick.Shapes.2) qt6qmlimport(QtQuick.Shapes.6) qt6qmlimport(QtQuick.Templates.2) qt6qmlimport(QtQuick.Templates.6) qt6qmlimport(QtQuick.Window.2) qt6qmlimport(QtQuick.Window.6) qt6qmlimport(QtQuick.tooling.1) qt6qmlimport(QtQuick.tooling.6) qt6qmlimport(QtTest.1) qt6qmlimport(QtTest.6) qtdeclarative-imports-provides-qt6 qtdeclarative-imports-provides-qt6(aarch-64)"
RDEPENDS:${PN} += "qt6-declarative-imports"

inherit rpm
