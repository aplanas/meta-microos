SUMMARY = "Qt 5 API Documentation in QCH format"
DESCRIPTION = "This package contains the Qt API Documentation in QCH format, which can be used by tools like KDevelop, Qt Assistant, Qt Creator, etc."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "5.15.9"

RPM_NAME = "libqt5-qtdoc-qch-5.15.9-2.1.noarch.rpm"
RPM_HASH = "8acd8199d1d18e914e6d5c7ebbb015ac8ea50820531f6b100d3f79a5450f6df1ec3187031e3c721ac4f5f88b0439032956cfa9ab1eb2bb9cfd6684cc585b63a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtdoc-qch"
RDEPENDS:${PN} += ""

inherit rpm
