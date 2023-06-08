SUMMARY = "Qt 6 LanguageServer library - Development files"
DESCRIPTION = "Development files for the Qt 6 LanguageServer private library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | GPL-2.0-or-later"

PV = "6.5.0"

RPM_NAME = "qt6-languageserver-private-devel-6.5.0-1.1.aarch64.rpm"
RPM_HASH = "c922a08dce45682e22f0d1068e5e9019fd65ebfa0da66fe3559a971bb791e9f2da986070a8728aa0c81646f3c7e782a30d76719ca16c2cb5133f80e0144325d8"

RPROVIDES:${PN} += "cmake(Qt6LanguageServerPrivate) qt6-languageserver-private-devel qt6-languageserver-private-devel(aarch-64)"
RDEPENDS:${PN} += "libQt6LanguageServer6 qt6-core-private-devel qt6-jsonrpc-private-devel"

inherit rpm
