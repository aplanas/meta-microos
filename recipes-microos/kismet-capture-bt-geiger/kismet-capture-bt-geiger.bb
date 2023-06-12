SUMMARY = "Kismet BTLE geiger counter capture helper"
DESCRIPTION = "Kismet is a wireless network and device detector, sniffer, wardriving \
tool, and WIDS (wireless intrusion detection) framework. \
 \
This subpackage contains the BTLE geiger counter capture helper."
LICENSE = "GPL-2.0-or-later"

PV = "2022_08_R1"

RPM_NAME = "kismet-capture-bt-geiger-2022_08_R1-2.3.aarch64.rpm"
RPM_HASH = "bd2f5d0881a8e5314d09cb869e66dde6a7774625d779c5297ac1f7f45391ab5c21b5e4fff2b749d98e344dac639a104b0d06608b57cb48a383f135ceee4300ca"

RPROVIDES:${PN} += "kismet-capture-bt-geiger \
kismet-capture-bt-geiger(aarch-64) \
python3.10dist(kismetcapturebtgeiger) \
python3dist(kismetcapturebtgeiger)"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi)"

inherit rpm
