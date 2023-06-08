SUMMARY = "Integration of the uGet Download Manager with Web browsers"
DESCRIPTION = "Integration of the uGet Download Manager with Google Chrome, \
Chromium, Opera, Vivaldi and Mozilla Firefox."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "uget-integrator-1.0.0-2.10.aarch64.rpm"
RPM_HASH = "0b6fedd31fa7a929020234cd3bb1c4a3cea03d19debf898f556475f3b485556fec5d3b56d7b7b8656417975952c2e7615be239a7653ce88d461937bcc3ecdab5"

RPROVIDES:${PN} += "uget-integrator uget-integrator(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 python3"

inherit rpm
