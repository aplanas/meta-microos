SUMMARY = "WireGuard interface for mitmproxy"
DESCRIPTION = "Transparently proxy any device that can be configured as a WireGuard client!"
LICENSE = "MIT"

PV = "0.1.23"

RPM_NAME = "python39-mitmproxy-wireguard-0.1.23-1.1.aarch64.rpm"
RPM_HASH = "b284e321fe0d3787bbcea20683bf86b715653f7b1b70d55cbb17ad952186f410d26778b08875d54a4402167b1abd1962c4c4f5cd5d4e516d9c003684caa65da9"

RPROVIDES:${PN} += "python3.9dist(mitmproxy-wireguard) \
python39-mitmproxy-wireguard \
python39-mitmproxy-wireguard(aarch-64) \
python3dist(mitmproxy-wireguard)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
python(abi) \
python39"

inherit rpm
