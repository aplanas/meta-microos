SUMMARY = "Qt 6 base development meta package"
DESCRIPTION = "This meta-package requires all the qt6-base development packages."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.0"

RPM_NAME = "qt6-base-devel-6.5.0-3.1.noarch.rpm"
RPM_HASH = "a6c59a38e24d744c89a682860653c0c02b5ce3f95379a2b135a8cf7e98fcf59d8513d499423ea77a9db97ed9f28598f2ef8a267fb4cf608ec13593df84941a7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qt6-base-devel"
RDEPENDS:${PN} += "cmake(Qt6Concurrent) cmake(Qt6Core) cmake(Qt6DBus) cmake(Qt6Gui) cmake(Qt6Network) cmake(Qt6OpenGL) cmake(Qt6OpenGLWidgets) cmake(Qt6PrintSupport) cmake(Qt6Sql) cmake(Qt6Test) cmake(Qt6Widgets) cmake(Qt6Xml) qt6-base-common-devel"

inherit rpm
