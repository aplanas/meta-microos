SUMMARY = "Implementation of XMPP message delivery receipts for Pidgin"
DESCRIPTION = "This plugin for Pidgin implements XMPP message delivery receipts (XEP-0184)."
LICENSE = "GPL-3.0-or-later"

PV = "0.8"

RPM_NAME = "pidgin-plugin-xmpp-receipts-0.8-1.21.aarch64.rpm"
RPM_HASH = "287e2dc0b5f342f53d06b119a29ae2f919560df45fd82323e71c927f595cce0d9e9f717418994ba78dae6c9536f4e0ff4a394098d00f58e4498e822f6bca1318"

RPROVIDES:${PN} += "pidgin-plugin-xmpp-receipts pidgin-plugin-xmpp-receipts(aarch-64) pidgin-xmpp-receipts"
RDEPENDS:${PN} += "libc.so.6(GLIBC_2.17)(64bit) pidgin"

inherit rpm
