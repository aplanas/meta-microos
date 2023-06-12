SUMMARY = "QDoc index files and doxygen tag files for Qt 5 API Documentation"
DESCRIPTION = "This package contains the QDoc index files and the doxygen tag files to create cross links between the QCH documentation files. This package is normally not \
required."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "5.15.9"

RPM_NAME = "libqt5-qtdoc-devel-5.15.9-2.1.noarch.rpm"
RPM_HASH = "c284e9a60ca6e0eed352eb9f8f146864543c4bdef62c748d2ebf8edfaf991f302ec2941f21b22e49a930813d107fc38b10efd040d673c22ff6d07cd3b1e3f000"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtdoc-devel"
RDEPENDS:${PN} += "doxygen \
libqt5-qttools"

inherit rpm
