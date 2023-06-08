SUMMARY = "Service daemon for mediating access to a GPS"
DESCRIPTION = "gpsd is a service daemon that mediates access to a GPS sensor connected \
to the host computer by serial or USB interface, making its data on the \
location/course/velocity of the sensor available to be queried on TCP \
port 2947 of the host computer.  With gpsd, multiple GPS client \
applications (such as navigational and wardriving software) can share \
access to a GPS without contention or loss of data.  Also, gpsd \
responds to queries with a format that is substantially easier to parse \
than NMEA 0183.  A client library is provided for applications. \
 \
After installing this RPM, gpsd will automatically connect to USB GPSes \
when they are plugged in and requires no configuration.  For serial \
GPSes, you will need to start gpsd by hand.  Once connected, the daemon \
automatically discovers the correct baudrate, stop bits, and protocol. \
The daemon will be quiescent when there are no clients asking for \
location information, and copes gracefully when the GPS is unplugged \
and replugged."
LICENSE = "BSD-3-Clause"

PV = "3.25"

RPM_NAME = "gpsd-3.25-1.3.aarch64.rpm"
RPM_HASH = "770671597d28b6cb9d18c19a8c2a19a0c669ce64c92e2b7178b897b80aca6431431084a20a13ad2cda1fa6d164e6a270c6cfc0bcacc20becef751499965f1c56"

RPROVIDES:${PN} += "gpsd gpsd(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/mkdir /usr/bin/touch coreutils fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbluetooth.so.3()(64bit) libc.so.6(GLIBC_2.34)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libm.so.6(GLIBC_2.35)(64bit) libusb-1.0.so.0()(64bit) systemd udev"

inherit rpm
