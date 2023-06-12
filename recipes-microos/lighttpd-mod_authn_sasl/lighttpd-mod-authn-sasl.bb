SUMMARY = "SASL authentication in lighttpd"
DESCRIPTION = "A module to provide SASL authentication in lighttpd."
LICENSE = "BSD-3-Clause"

PV = "1.4.71"

RPM_NAME = "lighttpd-mod_authn_sasl-1.4.71-1.1.aarch64.rpm"
RPM_HASH = "82d8a56279994294a3ee7364d1dcb4382a0e934a5fa0753d45aed5cae6120943849cfe44c23cbba30e6427668d807a8f92f5290d3ca7b642618d3128398ec9cb"

RPROVIDES:${PN} += "lighttpd-mod_authn_sasl \
lighttpd-mod_authn_sasl(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) \
libsasl2.so.3()(64bit) \
lighttpd"

inherit rpm
