SUMMARY = "Full-featured SSL VPN solution using a TUN/TAP Interface"
DESCRIPTION = "OpenVPN is an SSL VPN solution which can accommodate a wide \
range of configurations, including remote access, site-to-site VPNs, \
WiFi security, and remote access solutions with load \
balancing, failover, and fine-grained access-controls. \
 \
OpenVPN implements OSI layer 2 or 3 secure network extension using the \
SSL/TLS protocol, supports flexible client \
authentication methods based on certificates, smart cards, and/or \
2-factor authentication, and allows user or group-specific access \
control policies using firewall rules applied to the VPN virtual \
interface. \
 \
OpenVPN is not a web application proxy and does not operate through a \
web browser."
LICENSE = "GPL-2.0-only-WITH-openvpn-openssl-exception"

PV = "2.6.3"

RPM_NAME = "openvpn-2.6.3-1.1.aarch64.rpm"
RPM_HASH = "5ed6296f6a8ea74f2a133688c0b3941425632f5b4d474d18e0936a92328e2996a8b268c54f6ed951f6969737aebba48a36c42538c70ebc1ee3a2120da5c4d7d3"

RPROVIDES:${PN} += "openvpn openvpn(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh iproute2 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap-ng.so.0()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) liblz4.so.1()(64bit) liblzo2.so.2()(64bit) libpkcs11-helper.so.1()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libsystemd.so.0()(64bit) libsystemd.so.0(LIBSYSTEMD_209)(64bit) pkcs11-helper"

inherit rpm
