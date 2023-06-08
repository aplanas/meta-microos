SUMMARY = "LibreOffice Calc Extensions"
DESCRIPTION = "This package provides extensions for LibreOffice Calc: \
 \
- Convert Text to Number \
- New Functions NUMBERTEXT and MONEYTEXT \
- Solver for Nonlinear Programming"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-calc-extensions-7.5.3.1-1.1.aarch64.rpm"
RPM_HASH = "2ec7e1cedbc7d7a9d927bd23e4112dc582f54d7bf94c8a84f2241caac995065c0d8f7abf95939dbe72207ee6c57027de7af4c4fb9233906eb448071eecc5b3d1"

RPROVIDES:${PN} += "libreoffice-calc-extensions libreoffice-calc-extensions(aarch-64)"
RDEPENDS:${PN} += "jre-64 libreoffice libreoffice-calc libreoffice-pyuno"

inherit rpm
