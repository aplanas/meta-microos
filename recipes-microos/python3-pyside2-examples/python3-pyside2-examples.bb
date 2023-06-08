SUMMARY = "Examples for using PySide2"
DESCRIPTION = "Examples and Tutorials for the PySide2 bindings for Qt."
LICENSE = "BSD-3-Clause"

PV = "5.15.9"

RPM_NAME = "python3-pyside2-examples-5.15.9-1.2.noarch.rpm"
RPM_HASH = "3dfe30b09b260cbb11ec9279229d7642accabbd6b8d3faf4956290b222f818b9138001b4c7d6e3da75b6f88785c4ec69a8ac1d6474dfd2672ab04919d313aa6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyside2-examples"
RDEPENDS:${PN} += "python3-pyside2 qt5qmlimport(QtCharts.2) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Controls.2) qt5qmlimport(QtQuick.Controls.Material.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(QtQuick.Window.2) qt5qmlimport(QtWebEngine.1)"

inherit rpm
