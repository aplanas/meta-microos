SUMMARY = "XMPP HTTP File Upload plugin for libpurple"
DESCRIPTION = "A XEP-0363: HTTP File Upload plugin for libpurple (Pidgin, Finch)."
LICENSE = "GPL-3.0-or-later"

PV = "0.2.4"

RPM_NAME = "libpurple-plugin-xmpp-http-upload-0.2.4-1.8.aarch64.rpm"
RPM_HASH = "83a91ba2da05c7a87952f0dd5c7d2d62da3639e6ea3bdd70f1871f737414b7414e526daf47f95cad9193648798f29475fc5c83174d5fdc29d42ee875c0b9cb2d"

RPROVIDES:${PN} += "libjabber_http_file_upload.so()(64bit) libpurple-plugin-xmpp-http-upload libpurple-plugin-xmpp-http-upload(aarch-64)"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) libgio-2.0.so.0()(64bit) libglib-2.0.so.0()(64bit) libjabber.so.0()(64bit) libpurple.so.0()(64bit)"

inherit rpm
