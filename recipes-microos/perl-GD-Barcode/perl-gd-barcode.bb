SUMMARY = "Create barcode image with GD"
DESCRIPTION = "GD::Barcode is a subclass of GD and allows you to create barcode image with \
GD. This module based on 'Generate Barcode Ver 1.02 By Shisei Hanai \
97/08/22'. \
 \
From 1.14, you can use this module even if no GD (except plot method)."
LICENSE = "GPL-1.0+ | Artistic-1.0"

PV = "1.15"

RPM_NAME = "perl-GD-Barcode-1.15-25.26.noarch.rpm"
RPM_HASH = "5f15f69119c37cc0698795c310eaa60c76f3e1d881cda66d927f2ef4f4eefadcdd1470e0fa1aecd08496a2590fa1a64a638b100c65ad93473b314b9d7c4c352b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(GD::Barcode) perl(GD::Barcode::COOP2of5) perl(GD::Barcode::Code39) perl(GD::Barcode::EAN13) perl(GD::Barcode::EAN8) perl(GD::Barcode::IATA2of5) perl(GD::Barcode::ITF) perl(GD::Barcode::Industrial2of5) perl(GD::Barcode::Matrix2of5) perl(GD::Barcode::NW7) perl(GD::Barcode::QRcode) perl(GD::Barcode::UPCA) perl(GD::Barcode::UPCE) perl-GD-Barcode"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm
