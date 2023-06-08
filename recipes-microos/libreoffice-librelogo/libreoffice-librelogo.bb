SUMMARY = "LibreLogo scripting language"
DESCRIPTION = "Enables LibreLogo scripting in Writer. LibreLogo is a Logo-like \
programming language with interactive vectorgraphics for education and \
DTP."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-librelogo-7.5.3.1-1.1.aarch64.rpm"
RPM_HASH = "02a6040bf37d837c1b150efac8633cb4161a8b4892f3bb437819be5547104306b1e7089e75deb6449ab593e2fb380a9bc18abd2026b0d44a3f47670f72de0827"

RPROVIDES:${PN} += "libreoffice-librelogo libreoffice-librelogo(aarch-64)"
RDEPENDS:${PN} += "libreoffice-pyuno libreoffice-writer"

inherit rpm
