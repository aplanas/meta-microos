SUMMARY = "LibreLogo scripting language"
DESCRIPTION = "Enables LibreLogo scripting in Writer. LibreLogo is a Logo-like \
programming language with interactive vectorgraphics for education and \
DTP."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-librelogo-7.5.4.1-1.1.aarch64.rpm"
RPM_HASH = "f0723a65ed35d38ae86c6d6eb0b88dc9300b630a3287932650997f33b944ee9cb1ab30721acfaf9ac5a3ebf1f6b089b502267ba4ba183b321ef0f5eb75b4bb61"

RPROVIDES:${PN} += "libreoffice-librelogo \
libreoffice-librelogo(aarch-64)"
RDEPENDS:${PN} += "libreoffice-pyuno \
libreoffice-writer"

inherit rpm
