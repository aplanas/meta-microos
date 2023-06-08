SUMMARY = "LibreOffice SDK Documentation"
DESCRIPTION = "This package includes documentation and examples for the LibreOffice \
Software Development Kit (SDK)."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-sdk-doc-7.5.3.1-1.1.aarch64.rpm"
RPM_HASH = "aede540b9b4de58bbf6a8043264b8476778696e78c759d63cdc7ed28aaf0a411575a0b3ae6559b3ba0fd4fcf2cea1d7e7a92b888e3d0cb77c9e254eb6ddb1bdf"

RPROVIDES:${PN} += "libreoffice-sdk-doc libreoffice-sdk-doc(aarch-64) libreoffice-ure-devel-doc"
RDEPENDS:${PN} += ""

inherit rpm
