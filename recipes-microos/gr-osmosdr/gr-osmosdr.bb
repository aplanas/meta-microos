SUMMARY = "Gnuradio Source for OsmoSDR"
DESCRIPTION = "OsmoSDR Gnuradio Source supports the OsmoSDR hardware, but it also offers a \
wrapper functionality for FunCube Dongle, Ettus UHD and rtl-sdr radios."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "gr-osmosdr-0.2.4-1.1.aarch64.rpm"
RPM_HASH = "28fa21e04faef573b42489f93a05add4bbb486a4f661ada28bfdd63c04e668609e63de5be5df3ec6e664b6e8f8c9c2c923cef9faa89d8eb61aa10de2c2eee666"

RPROVIDES:${PN} += "gr-osmosdr gr-osmosdr(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 python3-gr-osmosdr"

inherit rpm
