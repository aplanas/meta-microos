SUMMARY = "Mail Merge Functionality for LibreOffice"
DESCRIPTION = "This module allows you to create form letters or send E-mail messages \
to many recipients using LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.3.1"

RPM_NAME = "libreoffice-mailmerge-7.5.3.1-1.1.aarch64.rpm"
RPM_HASH = "00c283ab3e8965f502edf6f466e9aaca781e88818c1c52322b0cfa97947fe459f8530d9925cd980b2087f96a5ab9d2a5f3209f3e76293af48c846263c4ebb1f0"

RPROVIDES:${PN} += "libreoffice-mailmerge libreoffice-mailmerge(aarch-64)"
RDEPENDS:${PN} += "libreoffice-pyuno"

inherit rpm
