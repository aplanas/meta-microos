SUMMARY = "Client for Cisco AnyConnect VPN"
DESCRIPTION = "This package provides a multi-protocol client for a number of SSL \
VPNs, such as: \
 \
* Cisco's 'AnyConnect' VPN (HTTPS/DTLS) supported by the ASA5500 Series, \
  by IOS 12.4(9)T or later on Cisco SR500, 870, 880, 1800, 2800, 3800, \
  7200 Series and Cisco 7301 Routers, and probably others. \
* Array Networks AG SSL VPN \
* Juniper SSL VPN \
* Pulse Connect Secure \
* Palo Alto Networks GlobalProtect SSL VPN \
* F5 Big-IP SSL VPN \
* Fortinet Fortigate SSL VPN"
LICENSE = "LGPL-2.1-or-later"

PV = "9.10"

RPM_NAME = "openconnect-9.10-1.1.aarch64.rpm"
RPM_HASH = "39fe82b663a87891d01e3b97cd1fedafa2068fc956f5e88de1aa410b1d55a2d6b6def5dcbfaabad2bdc116891e9db57a4c2f2747008cb088af7c3c1907bd19c2"

RPROVIDES:${PN} += "openconnect openconnect(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/python3 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgnutls.so.30()(64bit) libgnutls.so.30(GNUTLS_3_4)(64bit) libopenconnect.so.5()(64bit) libopenconnect.so.5(OPENCONNECT_5.0)(64bit) libopenconnect.so.5(OPENCONNECT_5_1)(64bit) libopenconnect.so.5(OPENCONNECT_5_2)(64bit) libopenconnect.so.5(OPENCONNECT_5_3)(64bit) libopenconnect.so.5(OPENCONNECT_5_4)(64bit) libopenconnect.so.5(OPENCONNECT_5_5)(64bit) libopenconnect.so.5(OPENCONNECT_5_6)(64bit) libopenconnect.so.5(OPENCONNECT_5_7)(64bit) libopenconnect.so.5(OPENCONNECT_5_8)(64bit) libopenconnect.so.5(OPENCONNECT_PRIVATE)(64bit) libproxy.so.1()(64bit) libproxy.so.1(LIBPROXY_0.4.16)(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit)"

inherit rpm
