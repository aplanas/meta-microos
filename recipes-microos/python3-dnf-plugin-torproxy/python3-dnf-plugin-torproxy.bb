SUMMARY = "Tor Proxy Plugin for DNF"
DESCRIPTION = "Tor proxy plugin forces DNF to use Tor to download packages. It makes sure that \
Tor is working and avoids leaking the hostname by using the proper SOCKS5 interface."
LICENSE = "GPL-2.0-or-later"

PV = "4.0.17"

RPM_NAME = "python3-dnf-plugin-torproxy-4.0.17-2.1.noarch.rpm"
RPM_HASH = "d3ce562b0269b5571c25f2f9eded0d494c91a9e4cfa255e1f2c1d45e5816b0e507889cdeac38fa85d3f66629e7138339d3c3a7f84c2f91cfb3a87c8135fb548c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config(python3-dnf-plugin-torproxy) dnf-plugin-torproxy dnf-plugins-extras-torproxy python3-dnf-plugin-torproxy python3-dnf-plugins-extras-torproxy"
RDEPENDS:${PN} += "python(abi) python3-dnf-plugins-extras-common python3-pycurl"

inherit rpm
