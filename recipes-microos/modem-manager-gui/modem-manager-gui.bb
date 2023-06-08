SUMMARY = "Modem Manager GUI"
DESCRIPTION = "This program is simple graphical interface for Modem Manager \
daemon dbus interface. \
Current features: \
- View device information: Operator name, Mode, IMEI, IMSI, \
  Signal level. \
- Send and receive SMS messages with long massages \
  concatenation and store messages in database. \
- Send USSD requests and read answers in GSM7 and UCS2 formats \
  converted to system UTF8 charset. \
- Scan available mobile networks."
LICENSE = "GPL-3.0-or-later"

PV = "0.0.20"

RPM_NAME = "modem-manager-gui-0.0.20-4.3.aarch64.rpm"
RPM_HASH = "0a2d3fe9c3806b0ac6878f2a360355f74ef3edeb1d114761db6bbba9c9995ae9063ad48529ca0b44c61bbe1cdc3efdfe8a567e6baa1d11a7010cf89aa02359d9"

RPROVIDES:${PN} += "application() application(modem-manager-gui.desktop) libmodcm_connman112.so()(64bit) libmodcm_nm09.so()(64bit) libmodcm_pppd245.so()(64bit) libmodmm_mm06.so()(64bit) libmodmm_mm07.so()(64bit) libmodmm_ofono109.so()(64bit) metainfo() metainfo(modem-manager-gui.appdata.xml) modem-manager-gui modem-manager-gui(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/python3 ModemManager ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcairo.so.2()(64bit) libgdbm.so.6()(64bit) libgdk-3.so.0()(64bit) libgdk_pixbuf-2.0.so.0()(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libgmodule-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libgtk-3.so.0()(64bit)"

inherit rpm
