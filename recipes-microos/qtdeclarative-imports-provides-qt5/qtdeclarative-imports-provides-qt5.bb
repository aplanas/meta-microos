SUMMARY = "RPM provides for QML modules from qtdeclarative"
DESCRIPTION = "A separately built package to avoid a build cycle."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "qtdeclarative-imports-provides-qt5-1.0-1.17.aarch64.rpm"
RPM_HASH = "2d50fd5a2d5cc794738b354724ec251b3193466ca131da6d72dec6204d9711da6a7fd1e88d3dae2304100fda4f20a558c13c1325810ff61a2f636bb1813198ca"

RPROVIDES:${PN} += "qt5qmlimport(Qt.labs.animation.1) qt5qmlimport(Qt.labs.folderlistmodel.1) qt5qmlimport(Qt.labs.folderlistmodel.2) qt5qmlimport(Qt.labs.qmlmodels.1) qt5qmlimport(Qt.labs.settings.1) qt5qmlimport(Qt.labs.sharedimage.1) qt5qmlimport(Qt.labs.wavefrontmesh.1) qt5qmlimport(QtQml.2) qt5qmlimport(QtQml.Models.2) qt5qmlimport(QtQml.StateMachine.1) qt5qmlimport(QtQml.WorkerScript.2) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(QtQuick.LocalStorage.2) qt5qmlimport(QtQuick.Particles.2) qt5qmlimport(QtQuick.Shapes.1) qt5qmlimport(QtQuick.Window.2) qtdeclarative-imports-provides-qt5 qtdeclarative-imports-provides-qt5(aarch-64)"
RDEPENDS:${PN} += "libQtQuick5"

inherit rpm
