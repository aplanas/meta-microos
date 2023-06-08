SUMMARY = "Documentation for qt6-speech in QCH format"
DESCRIPTION = "This package contains documentation for qt6-speech in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-speech-docs-qch-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "2020589d5908bcfb85a28924bcca91172ddc7e76b9a89853f9f53e067bcffa681e33ef267f0310cffabe0e3729b7def8ad170423928c732f9e628995c2f64a2c"

RPROVIDES:${PN} += "qt6-speech-docs-qch qt6-speech-docs-qch(aarch-64)"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
