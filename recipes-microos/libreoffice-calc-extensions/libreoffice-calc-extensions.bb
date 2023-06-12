SUMMARY = "LibreOffice Calc Extensions"
DESCRIPTION = "This package provides extensions for LibreOffice Calc: \
 \
- Convert Text to Number \
- New Functions NUMBERTEXT and MONEYTEXT \
- Solver for Nonlinear Programming"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-calc-extensions-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "9e1599e22aebb91e6da945d022f23c81208ff918d62ac8c27ef204af4012efeeb874ba33919a10991498244ccb7a3effeaf8175e94864830f96be5cd7cc026f0"

RPROVIDES:${PN} += "libreoffice-calc-extensions \
libreoffice-calc-extensions(aarch-64)"
RDEPENDS:${PN} += "jre-64 \
libreoffice \
libreoffice-calc \
libreoffice-pyuno"

inherit rpm
