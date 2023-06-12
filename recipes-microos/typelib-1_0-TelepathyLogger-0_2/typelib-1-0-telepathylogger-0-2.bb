SUMMARY = "Introspection bindings for the Telepathy Framework Centralized Logging"
DESCRIPTION = "tp-logger is a headless Observer client that logs information received by the \
Telepathy framework. It features pluggable backends to log different sorts of \
messages, in different formats. \
 \
tp-logger features a Telepathy-style D-Bus API to expose logs and interesting \
information related to logging (most frequent contacts, etc.). It also provides \
a GLib-compatible client API for making bulk log requests (e.g. for display \
logs in applications without having to provide lots of information over D-Bus). \
 \
This package provides the GObject Introspection bindings for Telepathy Logger."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "typelib-1_0-TelepathyLogger-0_2-0.8.2-7.9.aarch64.rpm"
RPM_HASH = "c23b6d00e159c0cd26df8595191f303f0681013e7e04279ab7a5e8364f074ab774d2512a73a1cf8c4c83083ba5dcfb349dd3a44605d10aba2186b0e125efe483"

RPROVIDES:${PN} += "typelib(TelepathyLogger) \
typelib-1_0-TelepathyLogger-0_2 \
typelib-1_0-TelepathyLogger-0_2(aarch-64)"
RDEPENDS:${PN} += "libtelepathy-logger.so.3()(64bit) \
typelib(GLib) \
typelib(GObject) \
typelib(Gio) \
typelib(TelepathyGLib)"

inherit rpm
