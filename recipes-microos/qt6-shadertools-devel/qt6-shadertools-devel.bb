SUMMARY = "Qt 6 ShaderTools library - Development files"
DESCRIPTION = "Development files for the Qt 6 ShaderTools library"
LICENSE = "GPL-3.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-shadertools-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "2df41b690538effca2a46ca7d94539049193a855d639a0e2c3611ffc18f1b9bd74c02af64d640bfa8d99b23e0e0b4f73ca3dd88272494559a877efb1c003aa10"

RPROVIDES:${PN} += "cmake(Qt6ShaderTools) cmake(Qt6ShaderToolsTools) pkgconfig(Qt6ShaderTools) qt6-shadertools-devel qt6-shadertools-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake(Qt6Gui) libQt6ShaderTools6 pkgconfig(Qt6Core) pkgconfig(Qt6Gui) qt6-shadertools"

inherit rpm
