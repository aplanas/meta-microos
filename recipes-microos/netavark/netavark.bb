SUMMARY = "Container network stack"
DESCRIPTION = "Netavark is a rust based network stack for containers. It is being \
designed to work with Podman but is also applicable for other OCI \
container management applications. \
Netavark is a tool for configuring networking for Linux containers. \
Its features include: \
* Configuration of container networks via JSON configuration file \
* Creation and management of required network interfaces, \
    including MACVLAN networks \
* All required firewall configuration to perform NAT and port \
    forwarding as required for containers \
* Support for iptables and firewalld at present, with support \
    for nftables planned in a future release \
* Support for rootless containers \
* Support for IPv4 and IPv6 \
* Support for container DNS resolution via aardvark-dns."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "netavark-1.6.0-1.1.aarch64.rpm"
RPM_HASH = "6c8ce60deac9887a589c4149f89a03777bb705cfda95129491946a6d6d085dd85a0203e4acc20c8b0769421104369692c0b8c157df20af6fd2127fc1d6406cf6"

RPROVIDES:${PN} += "netavark \
netavark(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit)"

inherit rpm
