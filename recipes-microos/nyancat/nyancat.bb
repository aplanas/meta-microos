SUMMARY = "The flying rainbow cat rendered in a terminal"
DESCRIPTION = "nyancat is an animated ANSI/xterm-88 color text program that renders a loop of \
the classic Nyan Cat animation. It includes a telnet server."
LICENSE = "NCSA"

PV = "1.5.2"

RPM_NAME = "nyancat-1.5.2-2.7.aarch64.rpm"
RPM_HASH = "3358b214177e2884da7aed49b717d7e1e2e587bda93c57f9c8fbeab73eaf1f36e70f28fff6874e1193aee6e9c1fd6d1fd7471492a61a28fbbdd663a6f106c600"

RPROVIDES:${PN} += "nyancat nyancat(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
